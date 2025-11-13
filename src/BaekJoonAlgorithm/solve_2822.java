package BaekJoonAlgorithm;

import java.util.*;

public class solve_2822 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[8][2];

        for (int i = 0; i < 8; i++) {
            scores[i][0] = sc.nextInt();
            scores[i][1] = i + 1;
        }

        Arrays.sort(scores, (a, b) -> b[0] - a[0]);

        int total = 0;
        List<Integer> problems = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            total += scores[i][0];
            problems.add(scores[i][1]);
        }

        Collections.sort(problems);

        System.out.println(total);
        for (int i = 0; i < problems.size(); i++) {
            System.out.print(problems.get(i));
            if (i < problems.size() - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
