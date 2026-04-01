class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i: nums1) set1.add(i);
        for(int i: nums2) set2.add(i);

        List<Integer> n1 = new ArrayList<>();
        List<Integer> n2 = new ArrayList<>();

        for(int n: set1){
            if(!set2.contains(n)) n1.add(n);
        }
        for(int n: set2){
            if(!set1.contains(n)) n2.add(n);
        }
        

        return Arrays.asList(n1, n2);

    }
}