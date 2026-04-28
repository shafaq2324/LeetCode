class Solution {
    public int reverse(int x) {
        long rev = 0;
        int sign = 1;
        double lower = Math.pow(-2, 31);
        double upper = Math.pow(2, 31) - 1;
        if(x < 0){
            sign = -1;
        }
        x = Math.abs(x);
        while( x != 0){
            int digit = x % 10; // extract last digit
            rev = rev*10 + digit; // add according to position
            x /=10; // decrement digit places 
        }
        if(rev < lower || rev > upper){
            return 0;
        }
        return (int) rev * sign;
    }
}