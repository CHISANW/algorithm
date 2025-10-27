package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String ans = "";

        String temp = line.replaceAll("XXXX" , "AAAA");
        ans = temp.replaceAll("XX", "BB");

        if(ans.contains("X")){
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }
}
