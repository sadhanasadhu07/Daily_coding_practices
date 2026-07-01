
import os
import subprocess
from datetime import datetime

REPO_PATH = r"D:/Leetcode_problems"  # Change this

os.chdir(REPO_PATH)

# Read session start time
try:
    with open(".session_start", "r") as f:
        session_start = float(f.read().strip())
except FileNotFoundError:
    print("No active session found.")
    print("Run start_session.py first.")
    exit()

files_to_push = []

for root, dirs, files in os.walk("."):
    # Skip .git folder
    if ".git" in root:
        continue

    for file in files:
        # Ignore session file and automation scripts
        if file in [
            ".session_start",
            "start_session.py",
            "daily_push.py"
        ]:
            continue

        filepath = os.path.join(root, file)

        try:
            modified_time = os.path.getmtime(filepath)

            if modified_time >= session_start:
                files_to_push.append(filepath)

        except Exception:
            pass

if not files_to_push:
    print("No files modified during this session.")
    exit()

print("\nFiles to be pushed:")
for file in files_to_push:
    print(file)

# Stage files
for file in files_to_push:
    subprocess.run(["git", "add", file])

# Create commit message from filenames
file_names = []

for file in files_to_push:
    name = os.path.splitext(os.path.basename(file))[0]

    if name not in file_names:
        file_names.append(name)

commit_msg = ", ".join(file_names)

# Commit and push
subprocess.run(["git", "commit", "-m", commit_msg])
subprocess.run(["git", "push", "origin", "master"])

print(f"\nPush completed!")
print(f"Commit Message: {commit_msg}")