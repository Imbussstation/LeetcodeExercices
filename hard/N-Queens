class Solution {
    public List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<>();
            char[][] board = new char[n][n];
            for (char[] chars : board) {
                Arrays.fill(chars, '.');
            }
            backtrack(res, board, 0);
            return res;
        }
        
        private void backtrack(List<List<String>> res, char[][] board, int row) {
            if (row == board.length) {
                res.add(construct(board));
                return;
            }
            int n = board[row].length;
            for (int col = 0; col < n; col++) {
                if (!isValid(board, row, col)) {
                    continue;
                }
                board[row][col] = 'Q';
                backtrack(res, board, row + 1);
                board[row][col] = '.';
            }
        }
        
        private boolean isValid(char[][] board, int row, int col) {
            int n = board.length;
            for (char[] chars : board) {
                if (chars[col] == 'Q') {
                    return false;
                }
            }
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
                if (board[i][j] == 'Q') {
                    return false;
                }
            }
            return true;
        }
        
        private List<String> construct(char[][] board) {
            List<String> path = new ArrayList<>();
            for (char[] chars : board) {
                path.add(new String(chars));
            }
            return path;
        }
}
