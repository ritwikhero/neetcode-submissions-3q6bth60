class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n == 1){
            return false;
        }
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(st.isEmpty() ||ch == '(' || ch == '[' || ch =='{'){
                st.push(ch);
                continue;
            }
            if(ch == ')'){
                if(st.peek() == '('){
                    st.pop();
                }
                else return false;
            }
            else if(ch == '}'){
                if(st.peek() == '{'){
                    st.pop();
                }
                else return false;
            }
            else if(ch == ']'){
                if(st.peek() == '['){
                    st.pop();
                }
                else return false;
            }
        }
        return st.isEmpty();
    }
}
