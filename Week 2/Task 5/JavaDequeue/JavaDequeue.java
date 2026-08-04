import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // total elements
        int m = sc.nextInt(); // window size

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // Add new element
            deque.addLast(num);
            set.add(num);

            // If window size reached
            if (deque.size() == m) {
                max = Math.max(max, set.size());

                // Remove first element
                int removed = deque.removeFirst();

                // If removed element is no longer in deque, remove from set
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }
        }

        System.out.println(max);
    }
}