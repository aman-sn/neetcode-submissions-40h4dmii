class Solution {
    public boolean isValidSudoku(char[][] board) {
       Set<Character> values=new HashSet<>();
       //rows
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(values.contains(board[i][j])&&board[i][j]!='.')
            return false;
            values.add(board[i][j]);
        }
        values.clear();
       }
       //columns
       for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(values.contains(board[j][i])&&board[j][i]!='.')
            return false;
            values.add(board[j][i]);
        }
        values.clear();
       }
       //boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {
                Set<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow + i][boxCol + j];
                        if (c != '.' && !boxSet.add(c)) {
                            return false;
                        }
                    }
                }
            }
        }
       return true;
    }
}
