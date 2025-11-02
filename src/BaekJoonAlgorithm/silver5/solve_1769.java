package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int count = 0;
        while (line.length() >1){
            count++;
            StringBuilder sb =new StringBuilder();
            int tempInt = 0;
            for(char c : line.toCharArray()){
                tempInt += c  -'0';
            }
            sb.append(tempInt);
            line = sb.toString();
        }
        System.out.println(count);
        System.out.println((line.charAt(0)- '0' )% 3 == 0 ? "YES" : "NO");
    }
}
