class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        
        if (len1 > len2) return false;

        // Frequency arrays for 'a' to 'z'
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Fill frequency array for s1 and the first window of s2
        for (int i = 0; i < len1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // Check if the first window matches
        if (matches(count1, count2)) return true;

        // Slide the window
        for (int i = len1; i < len2; i++) {
            // Add new character to the window
            count2[s2.charAt(i) - 'a']++;
            // Remove the old character from the window
            count2[s2.charAt(i - len1) - 'a']--;

            // Check if current window matches
            if (matches(count1, count2)) return true;
        }

        return false;
    }

    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }
}
