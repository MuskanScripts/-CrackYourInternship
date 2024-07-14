
class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        if (nums.length == 1)
            return 1;
        int a = nums[0];
        int j = 0;
        nums[j++] = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (a != nums[i]) {
                count++;
                a = nums[i];
                nums[j++] = nums[i];
            }
        }
        return count+1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int an = removeDuplicates(arr);
        System.out.println(an);
    }
}