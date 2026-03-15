class Solution {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        boolean neg = num < 0? true: false;
        StringBuilder ans = new StringBuilder();
        num = Math.abs(num);
        while(num != 0){
            String digit = String.valueOf(num % 7);
            ans.append(digit);
            num /= 7;
        }
        if(neg) ans.append("-");
        return ans.reverse().toString();
    }
}