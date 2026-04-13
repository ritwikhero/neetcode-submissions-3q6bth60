class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }
        
        int ans = 1;
        for(int i: nums){
            if(!set.contains(i-1)){
                int currNum = i;
                int count = 1;
            
            while(set.contains(currNum+1)){
                currNum++;
                count++;
            }
            ans = Math.max(ans,count);
        }
    }
    return ans;
    }
}
