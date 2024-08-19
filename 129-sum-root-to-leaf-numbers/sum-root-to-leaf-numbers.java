class Solution {

    int totalSum = 0;

    void findSum(TreeNode  root, int currNum) {
        if (root == null) return;
        if (root.left == null && root.right == null)
            totalSum += (currNum * 10 + root.val);
        currNum = currNum * 10 + root.val;
        findSum(root.left, currNum);
        findSum(root.right, currNum);
    }

    int sumNumbers(TreeNode root) {
        findSum(root, 0);
        return totalSum;
    }
};