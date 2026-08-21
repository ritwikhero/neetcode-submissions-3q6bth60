class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        
        int n1 = s.length(), n2 = t.length();

        if(n1 != n2){
            return false;
        }

        for(int i = 0; i < n1; i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                return false;
            }
        }
        return true;
    }
}
