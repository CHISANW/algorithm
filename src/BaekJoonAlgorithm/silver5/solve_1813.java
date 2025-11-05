package BaekJoonAlgorithm.silver5;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class solve_1813 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<n;i++){
            int num = sc.nextInt();

            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (key == value) {
                answer = Math.max(answer, key);
            }
        }

        if (map.getOrDefault(0, 0) == 0) {
            answer = Math.max(answer, 0);
        }

        System.out.println(answer);
    }
}
