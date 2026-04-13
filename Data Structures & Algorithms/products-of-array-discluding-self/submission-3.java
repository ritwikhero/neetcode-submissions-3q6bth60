class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1, zeroCount = 0;

        for(int i : nums){
            if(i != 0){
                prod *= i;
            }
            else{
                zeroCount++;
            }
        }

        if(zeroCount > 1){
            return new int[nums.length];
        }

        int[] res = new int[nums.length];

        for(int i = 0; i < res.length; i++){
            if(zeroCount > 0){
                res[i] = (nums[i] == 0) ? prod : 0;
            }
            else{
                res[i] = prod/nums[i];
            }
        }

        return res;
    }
}  
