class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];

        if(s1.length() > s2.length()){
            return false;
        }

        for(char ch : s1.toCharArray()){
            freq[ch-'a']++;
        }

        int i = 0, j = 0;
        int k = s1.length();

        while(j < s2.length()){
            freq[s2.charAt(j)-'a']--;

            if(j-i+1 == k){
                if(allZero(freq)){
                    return true;
                }
                freq[s2.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return false;
    }

    public boolean allZero(int[] freq){
        for(int i : freq){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
