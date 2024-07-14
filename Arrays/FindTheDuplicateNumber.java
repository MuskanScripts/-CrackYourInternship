/**
 * FindTheDuplicateNumber
 */
// https://leetcode.com/problems/find-the-duplicate-number/description/
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int n=nums.length;
        boolean [] arr = new boolean[n];
        //used boolean array to check if an element is already present in an array
        for(int i = 0;i< n; i++){
            if(arr[nums[i]]) return nums[i];
            arr[nums[i]] = true;
        }
        return - 1;
    }
    
}