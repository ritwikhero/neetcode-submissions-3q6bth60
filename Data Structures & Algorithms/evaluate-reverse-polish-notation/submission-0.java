class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        int result = 0;

        for(String s : tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int b = st.pop();
                int a = st.pop();

                result = operate(a,b,s);
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
    public int operate(int b, int a, String s){
        if(s.equals("+")){
            return a+b;
        }
        if(s.equals("-")){
            return b-a;
        }
        if(s.equals("*")){
            return (int)((long)a*(long)b);
        }
        if(s.equals("/")){
            return b/a;
        }
        return -1;
    }
}
