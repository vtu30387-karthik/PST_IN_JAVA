import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Store input as list of Map.Entry<SensorID, Temperature>
        List<Map.Entry<String, Integer>> readings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String sensorId = sc.next();
            int temp = sc.nextInt();
            readings.add(new AbstractMap.SimpleEntry<>(sensorId, temp));
        }

        // Stream processing
        Map<String, Double> avgTempBySensor =
                readings.stream()
                        // 1. Filter temperatures > 50
                        .filter(entry -> entry.getValue() > 50)

                        // 2 & 3. Group by SensorID and compute average
                        .collect(Collectors.groupingBy(
                                Map.Entry::getKey,
                                Collectors.averagingInt(Map.Entry::getValue)
                        ));

        // 4. Sort by average temperature descending
        avgTempBySensor.entrySet().stream()
                .sorted((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()))
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue())
                );

        sc.close();
    }
}