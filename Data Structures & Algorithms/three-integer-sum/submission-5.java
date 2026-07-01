class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //sort array 
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;
        //travesre the array 
        for(int i = 0; i < n ; i++){
            //fixing a number
            //if num[i] > 0 that means all the opther numbers are positive
            if(nums[i] > 0) break;
            
            //if same number like previous increment/continue
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int left = i+1, right = n-1;

            //two sum logic
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];

                if(sum > 0){
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else{
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    
                    //checking with nums[left-1] cause we are increamenting left
                    while(left < right && nums[left] == nums[left-1]) left++;
                    //checking with num[right+1] caise we are decreamenting right
                    while(left < right && nums[right] == nums[right+1]) right--;
                }
            }
        }

        return list;

    }
}
