class Solution {
    public boolean isValidSudoku(char[][] board) {
            Set<Character> set = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                set.clear();
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') continue;
                    if (set.contains(board[i][j])) return false;
                    set.add(board[i][j]);
                }
            }
            for (int i = 0; i < 9; i++) {
                set.clear();
                for (int j = 0; j < 9; j++) {
                    if (board[j][i] == '.') continue;
                    if (set.contains(board[j][i])) return false;
                    set.add(board[j][i]);
                }
            }
            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    set.clear();
                    for (int k = 0; k < 9; k++) {
                        if (board[i + k / 3][j + k % 3] == '.') continue;
                        if (set.contains(board[i + k / 3][j + k % 3])) return false;
                        set.add(board[i + k / 3][j + k % 3]);
                    }
                }
            }
            return true;
    }
}
