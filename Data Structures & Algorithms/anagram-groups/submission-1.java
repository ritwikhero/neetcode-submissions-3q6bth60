class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //map to add string and its corresponding list of string
        HashMap<String ,List<String>> hm = new HashMap<>();

        //iterate on the given array pf string
        for(int i = 0; i < strs.length; i++){
            //break string into characters
            char[] charArr = strs[i].toCharArray();

            //sort the characters
            Arrays.sort(charArr);

            //convert them into string
            String s = new String(charArr);
            
            //if the string is not present in hashmap add new list 
            if(!hm.containsKey(s)){
                hm.put(s,new ArrayList<>());
            }
            
            //if present add value to the given key string
            hm.get(s).add(strs[i]);
        }
        return new ArrayList<>(hm.values());
    }
}
