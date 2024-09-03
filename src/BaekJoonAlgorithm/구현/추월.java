package BaekJoonAlgorithm.구현;

import java.util.*;

public class 추월 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<String, Integer> start = new HashMap<>();
        List<String> end = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String next = sc.next();
            start.put(next, i);
        }

        for (int i = 1; i <= n; i++) {
            String next = sc.next();
            end.add(next);
        }

        int count = 0;

        for (int i = 0; i < end.size(); i++) {
            String car = end.get(i);
            for (int j = i + 1; j < end.size(); j++) {
                if (start.get(car) > start.get(end.get(j))) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
