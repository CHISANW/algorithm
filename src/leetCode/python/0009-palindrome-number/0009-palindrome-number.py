class Solution:
    def isPalindrome(self, x: int) -> bool:
        reverse = str(x)

        return reverse == reverse[::-1]