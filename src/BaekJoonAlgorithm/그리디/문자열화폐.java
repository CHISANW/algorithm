package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 문자열화폐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = m;
        int count = 0;

        while (n > 0){
            boolean added = false;
            for (int i = 26;i>=1;i--){
                int value = temp - i;
                int tempLength = n - 1;
                if (value >= tempLength){
                    sb.append((char) ('A' + i - 1));
                    count+=i;
                    temp = value;
                    n = tempLength;
                    added = true;
                    break;
                }
            }
            if (!added) break;
        }

        if (m == count){
            System.out.println(sb.reverse());
        }else{
            System.out.println("!");
        }
    }
}
