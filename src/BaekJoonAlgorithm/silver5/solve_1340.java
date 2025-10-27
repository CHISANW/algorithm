package BaekJoonAlgorithm.silver5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

public class solve_1340 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();
        String[] split = s.split(" ");
        String monthStr = split[0];
        int day = Integer.parseInt(split[1].replace(",","").trim());
        int year = Integer.parseInt(split[2]);
        String time = split[3];

        String[] hm = time.split(":");
        int hour = Integer.parseInt(hm[0]);
        int min = Integer.parseInt(hm[1]);

        Map<String, Integer> monthMap = Map.ofEntries(
                Map.entry("January", 1),
                Map.entry("February", 2),
                Map.entry("March", 3),
                Map.entry("April", 4),
                Map.entry("May", 5),
                Map.entry("June", 6),
                Map.entry("July", 7),
                Map.entry("August", 8),
                Map.entry("September", 9),
                Map.entry("October", 10),
                Map.entry("November", 11),
                Map.entry("December", 12)
        );

        int month = monthMap.get(monthStr);
        LocalDateTime now = LocalDateTime.of(year, month, day, hour, min);
        LocalDateTime start = LocalDateTime.of(year, 1, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(year + 1, 1, 1, 0, 0);
        long totalMinutes = Duration.between(start, end).toMinutes();
        long passedMinutes = Duration.between(start, now).toMinutes();
        double percentage = (double) passedMinutes / totalMinutes * 100.0;
        System.out.println(percentage);
    }
}
