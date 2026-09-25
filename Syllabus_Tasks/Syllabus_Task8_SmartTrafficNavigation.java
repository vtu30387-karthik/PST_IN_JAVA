import java.util.*;

public class SmartTrafficNavigation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        // Adjacency List
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Initialize graph
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Read roads
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u); // undirected
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        // BFS
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        queue.add(source);
        visited.add(source);

        boolean found = false;

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == destination) {
                found = true;
                break;
            }

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}