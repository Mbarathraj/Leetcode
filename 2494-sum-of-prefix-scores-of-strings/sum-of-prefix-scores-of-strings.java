class TrieNode {
    int count; // To count occurrences of prefixes
    TrieNode[] children;

    public TrieNode() {
        count = 0;
        children = new TrieNode[26]; // Assuming lowercase letters 'a' to 'z'
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert the word and count prefixes
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
            node.count++;
        }
    }

    // Get the sum of prefix scores for a word
    public int getPrefixScore(String word) {
        TrieNode node = root;
        int sum = 0;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            node = node.children[index];
            sum += node.count; // Accumulate the count of current prefix
        }
        return sum;
    }
}

class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int n = words.length;
        int[] result = new int[n];

        // Insert all words into the trie
        for (String word : words) {
            trie.insert(word);
        }

        // Calculate prefix scores for each word
        for (int i = 0; i < n; i++) {
            result[i] = trie.getPrefixScore(words[i]);
        }

        return result;
    }
}
