class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int n = s.length();
        int i = 0, j = 0;

        int maxCount = 0;
        int maxLen = 0;

        while(j < n){
            freq[s.charAt(j)-'A']++;

            maxCount = Math.max(maxCount,freq[s.charAt(j) - 'A']);

            while(j-i+1 - maxCount > k){
                freq[s.charAt(i) - 'A']--;
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}
