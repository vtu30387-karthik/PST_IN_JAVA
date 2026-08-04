import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt(); // size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // top k

        int[] result = topKFrequent(nums, k);

        // Output
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket list (no warning)
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            bucket.add(new ArrayList<>());
        }

        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            bucket.get(freq).add(key);
        }

        // Step 3: Collect top k elements
        int[] result = new int[k];
        int index = 0;

        for (int i = bucket.size() - 1; i >= 0 && index < k; i--) {
            for (int num : bucket.get(i)) {
                result[index++] = num;
                if (index == k) break;
            }
        }

        return result;
    }
}