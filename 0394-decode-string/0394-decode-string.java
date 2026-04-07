class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack();
        Stack<StringBuilder> string = new Stack();
        StringBuilder ans = new StringBuilder();
        int k = 0;
        for(Character ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k * 10 + (ch - '0');
            }
            else if(ch == '['){
                count.push(k);
                string.push(ans);
                ans = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                StringBuilder decoded = ans;
                ans = string.pop();
                int repeat = count.pop();
                while(repeat-- > 0){
                    ans.append(decoded);
                }
            }
            else{
                ans.append(ch);
            }

        }
        return ans.toString();
    }
}