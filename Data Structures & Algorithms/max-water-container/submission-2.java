class Solution {
    public int maxArea(int[] heights) {
        //two pointers O(n)
        int n = heights.length;
        int left = 0, right = n-1;
        int res = 0;
        while(left < right){
            int area = Math.min(heights[left],heights[right]) * (right-left);

            res = Math.max(res,area);

            if(heights[left] <= heights[right]){
                left++;
            }else{
                right--;
            }
        }

        return res;
    }
}
