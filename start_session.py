from datetime import datetime

with open(".session_start", "w") as f:
    f.write(str(datetime.now().timestamp()))

print("Coding session started!")