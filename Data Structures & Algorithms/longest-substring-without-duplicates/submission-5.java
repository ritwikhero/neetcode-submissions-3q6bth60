class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, n = s.length();

        int len = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        while(right < n){
            char ch = s.charAt(right);
            hm.put(ch, hm.getOrDefault(ch,0)+1);

            if(hm.get(ch) == 1){
                len = Math.max(hm.size(), len);
                right++;
            }
            else{
                hm.remove(s.charAt(left));
                left++;
            }
        }
        return len;
    }
}
