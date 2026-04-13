class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i :  nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> hm.get(a) - hm.get(b));

        for(int i : hm.keySet()){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        int i = 0;
        while(!minHeap.isEmpty()){
            res[i++] = minHeap.poll();
        }
        return res;
    }
}
