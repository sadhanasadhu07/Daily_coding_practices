from functools import cmp_to_key

def largestNumber(nums):
    nums = list(map(str, nums))

    def compare(x, y):
        if x + y > y + x:
            return -1
        elif x + y < y + x:
            return 1
        return 0

    nums.sort(key=cmp_to_key(compare))

    result = ''.join(nums)

    if result[0] == '0':
        return '0'

    return result


nums = list(map(int, input().split()))
print(largestNumber(nums))