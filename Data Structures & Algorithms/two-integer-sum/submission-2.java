class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length ; i++){
            int complement = target - nums[i];

            if(hm.containsKey(complement)){
                res[0] = i;
                res[1] = hm.get(complement);
            }
            hm.put(nums[i],i);
        }
        Arrays.sort(res);
        return res;
    }
}
