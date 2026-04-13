class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMax = getLeft(height,n);
        int[] rightMax = getRight(height,n);

        int sum = 0;

        for(int i = 0; i < n; i++){
            //width is 1 so no need to take width

            int h = Math.min(leftMax[i],rightMax[i])-height[i];

            sum += h;
        }

        return sum;
    }
    public int[] getLeft(int[] height, int n){
        int[] arr = new int[n];
        arr[0] = height[0];

        for(int i = 1; i < n; i++){
            arr[i] = Math.max(arr[i-1],height[i]);
        }
        return arr;
    }
    public int[] getRight(int[] height, int n){
        int[] arr = new int[n];
        arr[n-1] = height[n-1];

        for(int i = n-2; i >= 0; i--){
            arr[i] = Math.max(arr[i+1],height[i]);
        }
        return arr;
    }
}
