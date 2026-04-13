class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        
        int res = 1;

        for(int i : nums){
            
            if(!set.contains(i-1)){
                int count = 1;
            
                while(set.contains(i+1)){
                    i++;
                    count++;
                }

                res = Math.max(count,res);
            }
            
        }

        return res;
    }
}
