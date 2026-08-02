class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if(!hm.containsKey(sortedStr)){
                hm.put(sortedStr,new ArrayList<>());
            }
            hm.get(sortedStr).add(str);
        }

        return new ArrayList<>(hm.values());
    }
}
