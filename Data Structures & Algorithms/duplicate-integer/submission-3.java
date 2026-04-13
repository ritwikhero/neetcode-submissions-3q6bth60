class Solution {
    public boolean hasDuplicate(int[] nums) {
        //better solution O(N) TC O(N) SC

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> map: hm.entrySet()){
            if(map.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}