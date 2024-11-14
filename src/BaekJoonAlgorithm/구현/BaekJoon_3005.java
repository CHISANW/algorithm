package BaekJoonAlgorithm.구현;

import java.util.*;

public class BaekJoon_3005 {
    static char[][] arr;
    static int r, c;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();

        arr = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = sc.next();
            for (int j = 0; j < c; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < r; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < c; j++) {
                if (arr[i][j] != '#') {
                    sb.append(arr[i][j]);
                } else {
                    addWordIfValid(sb);
                    sb.setLength(0);
                }
            }
            addWordIfValid(sb);
        }

        for (int j = 0; j < c; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < r; i++) {
                if (arr[i][j] != '#') {
                    sb.append(arr[i][j]);
                } else {
                    addWordIfValid(sb);
                    sb.setLength(0);
                }
            }
            addWordIfValid(sb);
        }

        System.out.println(Collections.min(set));
    }

    static void addWordIfValid(StringBuilder sb) {
        if (sb.length() >= 2) {
            set.add(sb.toString());
        }
    }
}
