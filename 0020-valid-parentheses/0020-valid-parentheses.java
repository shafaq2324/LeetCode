class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                // if opening bracket add to stack
            }
            else{
                if(stack.isEmpty()){
                    return false; 
                    // if closing bracket found and stack has no opening bracket then false
                }
                char top = stack.pop();
                if(c == ')' && top != '(' || c == ']' && top != '[' ||
                c == '}' && top != '{'){
                    return false;
                    // pop opening bracket if valid closing bracket found
                }
            }
        }
        return stack.isEmpty(); // if stack empty all brackets matched

    }
}