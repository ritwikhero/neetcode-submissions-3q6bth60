class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        // int[] arr = new int[n+m];

        // for(int i = 0; i < n; i++){
        //     arr[i] = nums1[i];
        // }

        // for(int i = n; i < arr.length; i++){
        //     arr[i] = nums2[ ]
        // }

        ArrayList<Integer> list = new ArrayList<>();

        for(int i : nums1){
            list.add(i);
        }
        for(int i : nums2){
            list.add(i);
        }

        Collections.sort(list);

        if(list.size() % 2 == 0){
            return (list.get(list.size()/2-1) + list.get(list.size()/2)) / 2.0;
        }
        else {
            return list.get(list.size()/2);
        }
    }
}
