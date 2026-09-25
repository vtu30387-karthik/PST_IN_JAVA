import java.util.*;

public class HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        Map<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            String hashtag = sc.nextLine().trim();

            if (map.containsKey(hashtag)) {
                map.put(hashtag, map.get(hashtag) + 1);
            } else {
                map.put(hashtag, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        sc.close();
    }
}