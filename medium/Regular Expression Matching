class Solution {
    public boolean isMatch(String s, String p) {
        int sLength = s.length();
            int pLength = p.length();
            boolean[][] dp = new boolean[sLength + 1][pLength + 1];
            dp[0][0] = true;
            for (int i = 1; i <= pLength; i++) {
                if (p.charAt(i - 1) == '*') {
                    dp[0][i] = dp[0][i - 2];
                }
            }
            for (int i = 1; i <= sLength; i++) {
                for (int j = 1; j <= pLength; j++) {
                    if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else if (p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 2];
                        if (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1)) {
                            dp[i][j] = dp[i][j] || dp[i - 1][j];
                        }
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
            return dp[sLength][pLength];
    }
}
