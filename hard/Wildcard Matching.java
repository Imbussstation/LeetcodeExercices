class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
            boolean[][] f = new boolean[m + 1][n + 1];
            f[0][0] = true;
            for (int i = 1; i <= n; ++i) {
                if (p.charAt(i - 1) == '*') {
                    f[0][i] = true;
                } else {
                    break;
                }
            }
            for (int i = 1; i <= m; ++i) {
                for (int j = 1; j <= n; ++j) {
                    if (p.charAt(j - 1) == '*') {
                        f[i][j] = f[i][j - 1] || f[i - 1][j];
                    } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
            return f[m][n];
    }
}
