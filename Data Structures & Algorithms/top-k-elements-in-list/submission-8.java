class Solution {
public int[] topKFrequent(int[] nums, int k) {
        // optimal approach using bucket sort
        // use hashmap to store the {number, freq} values

        // 1. store frequency O(N) SC ---> HASHMAP
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        // storing {number, freq} values
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        // 2. Create bucket SC O(N) ---> N-> length of the array
        // define bucket for storing bucket[Freq]
        //max frequency can be length of the array
        List<Integer>[] buckets = new List[nums.length+1];
        
        // 3. add numbers to frequncy buckets
       //add the numbers to frequncy buckets, fill the buckets with number
       for(int i : hm.keySet()){
        int freq = hm.get(i);
        if(buckets[freq] == null){
           buckets[freq] = new ArrayList<>();
        }
        buckets[freq].add(i);
       }

        // 4. get top k frequent elements
        //create an array to return the value
        int[] res = new int[k];
        int idx = 0;
       
    //    start  from the top frequncy bucket
       for(int i = buckets.length-1; i >= 0 && idx < k; i--){
        if(buckets[i] != null){
            for(int num: buckets[i]){
                res[idx++] = num;
                if(idx == k) break;
            }
        }
       }
        return res;
    }
}

