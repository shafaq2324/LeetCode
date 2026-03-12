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
            int digit = x % 10;
            rev = rev*10 + digit;
            x /=10;
        }
        if(rev < lower || rev > upper){
            return 0;
        }
        return (int) rev * sign;
    }
}