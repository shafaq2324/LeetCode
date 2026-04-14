class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        for(int num = 1; num <= n; num++){
            ans.add("Push");
            if(target[i] == num){
                i++;
                if(i == target.length) break;
            }else{
                ans.add("Pop");
            }
        }
        return ans;
    }
}