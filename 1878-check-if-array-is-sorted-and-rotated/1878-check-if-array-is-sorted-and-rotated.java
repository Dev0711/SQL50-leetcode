class Solution {
    public boolean check(int[] nums) {
          int count = 0; // To count the number of break points
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Compare current element with the next element in a circular manner
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            // If there is more than one break point, the array cannot be rotated sor
            if (count > 1) {
                return false;
            }
        }
        
        return true; // Valid rotated sorted array
    }
}