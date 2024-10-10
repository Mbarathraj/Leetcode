import java.util.Stack;

class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        
        // Create a stack to hold indices of nums in increasing order
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        System.out.print(stack);
        int maxRamp = 0;
        
        // Traverse from the end to find the maximum width
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxRamp = Math.max(maxRamp, j - stack.pop());
            }
        }
        
        return maxRamp;
    }
}
