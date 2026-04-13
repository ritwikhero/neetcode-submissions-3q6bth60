class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        

        for(int i :  nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(hm.keySet());
        list.sort((a,b) -> hm.get(b) - hm.get(a));
        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = list.get(i);
        } 
        return res;
    }
}
