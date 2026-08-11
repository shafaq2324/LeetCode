class Solution {
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        int l = str.length();
        for(int i = l-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        for(int i = 0; i < 32 - l; i++){
            sb.append("0");
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}