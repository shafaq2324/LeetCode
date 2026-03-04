class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int p1, p2, p3;
        p1=p2=p3 = 0;
        int arr[] = new int[m+n];
        while(p1 < n && p2 < m){
            if(nums1[p1] <= nums2[p2]){
                arr[p3++] = nums1[p1++];
            }
            else{
                arr[p3++] = nums2[p2++];
            }
        }

        while (p1 < n) arr[p3++] = nums1[p1++];
        while (p2 < m) arr[p3++] = nums2[p2++];

        if((m+n)%2 == 1){
            return (double)arr[(m+n)/2];
        }
        else{
            return (double)(arr[(m+n)/2] +arr[((m+n)/2 ) - 1])/2;
        }
    }
}