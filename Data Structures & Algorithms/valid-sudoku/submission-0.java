class Solution {
    public boolean isValidSudoku(char[][] board) {
        //validate rows
        for(int row = 0; row < 9; row++){
            HashSet<Character> set = new HashSet<>();

            for(int col = 0; col < 9; col++){
                if(board[row][col] == '.'){
                    continue;
                } 
                if(set.contains(board[row][col])){
                    return false;
                }
                set.add(board[row][col]);
            }
        }

        //validate cols
        for(int col = 0; col < 9; col++){
            HashSet<Character> set = new HashSet<>();

            for(int row = 0; row < 9; row++){
                if(board[row][col] == '.'){
                    continue;
                } 
                if(set.contains(board[row][col])){
                    return false;
                }
                set.add(board[row][col]);
            }
        }
        //validate 3x3 box
        for(int sr = 0; sr < 9; sr+=3){
            int er = sr+2;
            for(int sc = 0; sc < 9; sc+=3){
                int ec = sc+2;
                //traverse 3x3 box

                if(!isValidBox(board,sr,er,sc,ec)){
                    return false;
                }
            }
        }

        //valid sukodu
        return true;
    }

    public boolean isValidBox(char[][] board,int sr,int er,int sc, int ec){
        HashSet<Character> set = new HashSet<>();

        for(int i = sr; i <= er; i++){
            for(int j = sc; j <= ec; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
}
