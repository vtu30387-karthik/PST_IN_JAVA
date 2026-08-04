import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of salaries

        // Read salaries into list
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        // Increase each salary by 10% using stream
        List<Integer> updated = salaries.stream()
                .map(s -> (int)(s * 1.10)) // increase by 10%
                .collect(Collectors.toList());

        // Print updated salaries
        updated.forEach(s -> System.out.print(s + " "));
    }
}
