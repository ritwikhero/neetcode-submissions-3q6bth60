class Solution {
    public String minWindow(String s, String t) {
        // if t is bigger than s we send empty array
        if(t.length() > s.length()){
            return "";
        }

        int n = s.length();
        //put all the character of t in the map to keep count
        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char ch : t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int i = 0, j = 0;
        //initialise required variables
        int minWindow = Integer.MAX_VALUE;
        int countRequired = t.length();
        int start_i = 0;

        //sliding window templet
        while(j < n){
            char ch = s.charAt(j);
            //if the character is already in the map we decrease the countRequired 
            if(hm.containsKey(ch) && hm.get(ch) > 0){
                countRequired--;
            }
            
            //irresecpective if the character is pressent or not we deceasre their count
            hm.put(ch,hm.getOrDefault(ch,0)-1);
            
            //slide the window to get the best minWindown len 
            while(countRequired == 0){
                //compare till we get the best minWindow 
                minWindow = Math.min(minWindow,j-i+1);
                start_i = i;
                
                //slide from the ith pointer
                char start = s.charAt(i);
                //increase the count irrespective if it in our map or not and slide the pointer
                hm.put(start,hm.getOrDefault(start,0)+1);
                
                //if the character is present in the map we increase the count
                if(hm.containsKey(start) && hm.get(start) > 0){
                    countRequired++;
                }

                i++;
            }
            //j keeps going ahead
            j++;
        }
        //if minWindow stays the same send empty string else send the substring;
        return minWindow == Integer.MAX_VALUE ? "" : s.substring(start_i,start_i+minWindow);
    }
}
