package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_14405 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        if (line.matches("(pi|ka|chu)+")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
