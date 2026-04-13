class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str = "";

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                str += ch;
            }
            else{
                continue;
            }
        }

        return palindromeHelper(str,0,str.length()-1);
    }
    public boolean palindromeHelper(String s, int left ,int right){
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
