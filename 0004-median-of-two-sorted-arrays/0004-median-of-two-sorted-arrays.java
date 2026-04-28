class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int p1, p2, p3;
        // Pointers for nums1, nums2, and the merged array respectively
        p1=p2=p3 = 0;
        // combined array
        int arr[] = new int[m+n];
        while(p1 < n && p2 < m){
            if(nums1[p1] <= nums2[p2]){
                arr[p3++] = nums1[p1++];
            }
            else{
                arr[p3++] = nums2[p2++];
            }
        }

        while (p1 < n) arr[p3++] = nums1[p1++]; // if nums1 has remaining elements
        while (p2 < m) arr[p3++] = nums2[p2++]; // if nums2 has remaining elements

        if((m+n)%2 == 1){
            return (double)arr[(m+n)/2];
            // If the total number of elements is odd, return the middle element
        }
        else{
            return (double)(arr[(m+n)/2] +arr[((m+n)/2 ) - 1])/2;
            // If even, return the average of the two middle elements
        }
    }
}