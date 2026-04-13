class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        if(n == 0){
            return 0;
        }

        int count = 1;
        int ans = 1;

        for(int i = 1; i < n ; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1]+1){
                count++;
            }
            else{
                count = 1;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
