class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map to add string and its corresponding list of string
        HashMap<String ,List<String>> hm = new HashMap<>();

        //iterate on the given array pf string O(N -> lenth of stirng array)
        for(int i = 0; i < strs.length; i++){
            //create a freq array
            int[] freq = new int[26];

            //store freq map of each word
            // O(K -> length of max word)
            for(char ch : strs[i].toCharArray()){
                freq[ch - 'a']++;
            } 
            //convert the freq hashtable to string 
            //it would look something like this {1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0};
            String key = Arrays.toString(freq);
            
            //if the string is not present in hashmap add new list 
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            
            //if present add value to the given key string
            hm.get(key).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
