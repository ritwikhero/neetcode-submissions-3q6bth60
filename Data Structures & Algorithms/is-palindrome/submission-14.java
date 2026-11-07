class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                str += ch;
            }
        }
        str = str.toLowerCase();
        int i = 0,  j = str.length()-1;

        while(i <= j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;   
        }
        return true;
    }
}
