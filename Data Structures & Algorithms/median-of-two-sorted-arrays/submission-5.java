class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int len = n+m;
        int ind2 = len/2;
        int ind1 = ind2-1;
        int ind1el = Integer.MIN_VALUE, ind2el = Integer.MIN_VALUE;
        int count = 0;
        int i =0, j= 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                if(count == ind1) ind1el = nums1[i];
                if(count == ind2) ind2el = nums1[i];
                count++;
                i++;
            }
            else{
                if(count == ind1) ind1el = nums2[j];
                if(count == ind2) ind2el = nums2[j];
                count++;
                j++;
            }
        }

        while(i < n){
            if(count == ind1) ind1el = nums1[i];
                if(count == ind2) ind2el = nums1[i];
                count++;
                i++;
        }
        while(j < m){
            if(count == ind1) ind1el = nums2[j];
                if(count == ind2) ind2el = nums2[j];
                count++;
                j++;
        }

        if(len % 2 == 1){
            return (double)(ind2el);
        }else{

            return (ind1el + ind2el)/2.0;
        }
    }
}