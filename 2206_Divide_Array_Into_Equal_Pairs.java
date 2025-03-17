import java.util.Arrays;

class Solution {
    public boolean divideArray(int[] nums) {
        int len = nums.length;
        
        if (len % 2 != 0) {
            return false; // If the array length is odd, it's impossible to form pairs
        }
        
        int[] count = new int[501]; // Array to store frequencies (since 1 <= nums[i] <= 500)
        
        // Count the frequency of each number
        for (int num : nums) {
            count[num]++;
        }
        
        // Check if all frequencies are even
        for (int i = 1; i <= 500; i++) {
            if (count[i] % 2 != 0) {
                return false;
            }
        }
        
        return true; // All numbers can be paired
    }
}
