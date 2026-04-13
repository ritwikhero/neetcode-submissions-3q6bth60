class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return list;
        }    
        Arrays.sort(nums);
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int n1 = nums[i];
            int target = -n1;

            twoSum(nums,target,i+1,n-1);
        }
        return list;
    }
    public void twoSum(int[] nums, int target, int i,int j){
        while(i < j){
            int sum = nums[i]+nums[j];

            if(sum > target){
                j--;
            }
            else if(sum < target){
                i++;
            }
            else{
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;

                list.add(Arrays.asList(-target,nums[i],nums[j])); 
                i++;
                j--;
            }
        }
    }
}
