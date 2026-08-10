class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1)){
            // if not equal from both sides then no gcd return empty string
            int a = str1.length();
            int b = str2.length();
            while(b != 0){
                // gcd logic 
                // if both strings are valid to be computed then just find gcd of their lengths
                int temp = b;
                b = a % b;
                a = temp;
            }
            return str1.substring(0, a);
        }
        return "";
    }
}