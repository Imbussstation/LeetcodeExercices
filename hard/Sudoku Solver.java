class Solution {
    public void solveSudoku(char[][] board) {
            int[][] row = new int[9][9];
            int[][] col = new int[9][9];
            int[][] box = new int[9][9];
            List<int[]> spaces = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++){
                    if (board[i][j] == '.') {
                        spaces.add(new int[]{i, j});
                    } else {
                        int digit = board[i][j] - '0' - 1;
                        row[i][digit]++;
                        col[j][digit]++;
                        box[i / 3 * 3 + j / 3][digit]++;
                    }
                }
            }
            dfs(board, spaces, row, col, box, 0);
        }
        
        private boolean dfs(char[][] board, List<int[]> spaces, int[][] row, int[][] col, int[][] box, int pos) {
            if (pos == spaces.size()) {
                return true;
            }
            int[] space = spaces.get(pos);
            int i = space[0], j = space[1];
            for (int digit = 0; digit < 9; digit++) {
                if (row[i][digit] + col[j][digit] + box[i / 3 * 3 + j / 3][digit] == 0) {
                    row[i][digit]++;
                    col[j][digit]++;
                    box[i / 3 * 3 + j / 3][digit]++;
                    board[i][j] = (char) (digit + '0' + 1);
                    if (dfs(board, spaces, row, col, box, pos + 1)) {
                        return true;
                    }
                    board[i][j] = '.';
                    row[i][digit]--;
                    col[j][digit]--;
                    box[i / 3 * 3 + j / 3][digit]--;
                }
            }
            return false;
        }
}
