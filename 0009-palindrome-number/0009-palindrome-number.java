class Solution {
    public boolean isPalindrome(int x) {
        int og = x;
        int rev = 0;
        if(x < 0){
            return false; // negative numbers cannot be palindromic
        }
        while( x != 0){
            int digit = x % 10; // extract last digit
            rev = rev*10 + digit; // add according to position
            x /=10; // move ahead
        }
        return og == rev; // compare
    }
}