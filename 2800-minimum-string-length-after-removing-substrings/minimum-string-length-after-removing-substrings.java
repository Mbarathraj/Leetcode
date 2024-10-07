class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        boolean found;
        do {
            found = false;
            for (int i = 0; i < sb.length() - 1; i++) {
                String pair = sb.substring(i, i + 2);
                if (pair.equals("AB") || pair.equals("CD")) {
                    sb.delete(i, i + 2); // Remove the pair
                    found = true; // Indicate that we found a pair to remove
                    break; // Break to start over from the beginning
                }
            }
        } while (found); // Continue until no pairs are found

        return sb.length(); // Return the remaining length of the string
    }
}
