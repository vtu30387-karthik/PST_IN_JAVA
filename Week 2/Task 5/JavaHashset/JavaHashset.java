import java.util.*;

public class JavaHashset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of pairs
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < t; i++) {
            String left = sc.next();
            String right = sc.next();

            // Create unique pair string
            String pair = left + " " + right;

            set.add(pair);

            // Print current unique count
            System.out.println(set.size());
        }
    }
}