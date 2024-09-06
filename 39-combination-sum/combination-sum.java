class Solution {
    ArrayList<Integer> currentCombination=new ArrayList<>();
    List<List<Integer>> results=new ArrayList<>();
     void findCombinations(int[] candidates, int target, int start) {
        // Base case: if target is 0, add the current combination to results
        if (target == 0) {
            results.add(new ArrayList<>(currentCombination));
            return;
        }

        // Loop through the candidates
        for (int i = start; i < candidates.length; i++) {
            // If the current number is greater than the remaining target, skip it
            if (candidates[i] > target) {
                break; // Early exit since candidates are sorted
            }

            // Include the candidate in the current combination
            currentCombination.add(candidates[i]);
            
            // Recursively call findCombinations with updated target and start index
            findCombinations(candidates, target - candidates[i], i); // Not i + 1 because we can reuse the same element
            
            // Backtrack: Remove the last added element to try the next candidate
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] c, int target) {
        Arrays.sort(c);
        findCombinations(c,target,0);
        return results;
    }
}