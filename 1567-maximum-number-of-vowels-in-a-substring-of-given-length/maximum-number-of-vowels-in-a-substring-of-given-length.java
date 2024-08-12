class Solution {
    public int maxVowels(String s, int k) {
        String vow = "aeiou";
        int max = 0;  // Initialize to 0 instead of Integer.MIN_VALUE
        int st = 0, end = 0, c = 0;

        while (end < s.length()) {
            // Check if we have reached the window size k
            if (end - st + 1 > k) {
                // Update max with the current vowel count
                max = Math.max(max, c);
                // Remove the effect of the character at the start of the window
                if (vow.indexOf(s.charAt(st)) != -1) {
                    c--;
                }
                st++;
            }
            
            // Add the effect of the new character at the end of the window
            if (vow.indexOf(s.charAt(end)) != -1) {
                c++;
            }
            
            end++;
        }

        // Final update to max after exiting the loop
        max = Math.max(max, c);

        return max;
    }
}
