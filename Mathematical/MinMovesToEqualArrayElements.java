import java.util.Arrays;

public class MinMovesToEqualArrayElements {
    class Solution {
        public int minMoves2(int[] nums) {

            if (nums.length == 1)
                return 0;

            Arrays.sort(nums);

            int median = nums[nums.length / 2];

            int totalMoves = 0;
            for (int num : nums) {
                totalMoves += Math.abs(num - median);
            }

            return totalMoves;
        }
    }
}
