import java.util.HashSet;

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        HashSet<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = i; // Initially, all characters are extra
        }

        for (int i = 0; i < n; i++) {
            // Case 1: If current character is considered extra
            dp[i + 1] = Math.min(dp[i + 1], dp[i] + 1);
            
            // Case 2: If current substring can be formed using dictionary
            for (int j = i + 1; j <= n; j++) {
                if (dictSet.contains(s.substring(i, j))) {
                    dp[j] = Math.min(dp[j], dp[i]);
                }
            }
        }

        return dp[n];
    }
}
