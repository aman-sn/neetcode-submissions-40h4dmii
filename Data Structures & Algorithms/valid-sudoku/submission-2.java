class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> cellSet = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char cell = board[i][j];
                if(cellSet.contains(cell)) return false;
                if(cell !='.') cellSet.add(cell);
            }
        }
        for(int i = 0; i < 9; i++){
            Set<Character> cellSet = new HashSet<>();
            for(int j = 0; j < 9; j++){
                char cell = board[j][i];
                if(cellSet.contains(cell)) return false;
                if(cell !='.') cellSet.add(cell);
            }
        }
        for(int i = 0; i < 9; i += 3){
            for(int j = 0; j < 9; j += 3){
                Set<Character> cellSet = new HashSet<>();
                for(int k = i; k < i + 3; k++){
                    for(int l = j; l < j + 3; l++){
                        char cell = board[k][l];
                        if(cellSet.contains(cell)) return false;
                        if(cell !='.') cellSet.add(cell);
                    }
                }
            }
        }
        return true;
    }
}
