class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivotIndex = findPivot(nums,n);

        int leftHalf = binarySearch(nums,0,pivotIndex,target);
        int rightHalf = binarySearch(nums,pivotIndex+1,n-1,target);

        if(leftHalf != -1){
            return leftHalf;
        }
        else if(rightHalf != -1){
            return rightHalf;
        }
        return -1;
    }

    public int binarySearch(int[] nums,int left , int right, int target){
        while(left <= right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums,int n){
        int left = 0, right = n-1;

        while(left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] < nums[right]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return left-1;
    }
}
