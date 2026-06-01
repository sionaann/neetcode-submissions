class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element of the array starting from the first element
        for (int i = 0; i < nums.length; i++) {
            // Start a nested loop from the next element
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the elements at indices i and j equals the target
                if (nums[i] + nums[j] == target) {
                    // Return the indices in ascending order
                    return new int[]{i, j};
                }
            }
        }
        // Default return statement (though the assumption says there is always a valid pair)
        return new int[]{-1, -1}; 
    }
}