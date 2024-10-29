package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 아스키도형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int area = 0;
        sc.nextLine();

        for (int i = 0; i < h; i++) {
            String line = sc.nextLine();
            boolean inside = false;

            for (int j = 0; j < w; j++) {
                char ch = line.charAt(j);

                if (ch == '/' || ch == '\\') {
                    area++;
                    inside = !inside;
                } else if (inside) {
                    area += 2;
                }
            }
        }

        System.out.println(area / 2);
    }
}
