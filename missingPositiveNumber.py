def firstMissingPositive(nums):
    

    smallest = 1
    while smallest in nums:
        smallest += 1

    return smallest


nums = list(map(int, input().split(" ")))
print(firstMissingPositive(set(nums)))