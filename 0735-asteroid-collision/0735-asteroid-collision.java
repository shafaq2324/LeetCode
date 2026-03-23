class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> ast = new Stack<>();
        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0){
                ast.push(asteroids[i]);
            }
            else{
                while((!ast.isEmpty()) && ast.peek() > 0 && ast.peek() < -asteroids[i]){
                    ast.pop();
                }
                if((!ast.isEmpty()) && ast.peek() == -asteroids[i]){
                    ast.pop();
                    continue;
                }
                else if(ast.isEmpty() || ast.peek() < 0){
                    ast.push(asteroids[i]);
                }
            }
        }
        int[] ans = new int[ast.size()];
        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = ast.pop();
        }
        return ans;
    }
}