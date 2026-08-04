public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        
        int[] result = buildArray(nums);
        
        // Print output
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}