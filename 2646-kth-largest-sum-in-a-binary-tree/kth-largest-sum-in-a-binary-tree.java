import java.util.*;

class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Long> levelSums = new ArrayList<>();

        while (!q.isEmpty()) {
            int levelSize = q.size();
            long sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;

                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }

            levelSums.add(sum);
        }

        // Sort the level sums in descending order
        Collections.sort(levelSums, Collections.reverseOrder());

        // Check if we have enough levels
        if (k > levelSums.size()) return -1;

        // Return the k-th largest level sum
        return levelSums.get(k - 1);
    }
}
