package BaekJoonAlgorithm.수학;

import java.text.DecimalFormat;
import java.util.Scanner;

public class 평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-->0){
            double n = sc.nextInt();

            double sum = 0;
            int count =0;
            int[] arr= new int[(int)n];
            for (double i =0;i<n;i++){
                double a = sc.nextDouble();
                arr[(int) i] = (int) a;
                sum+=a;
            }

            double avg = sum/n;
            for (int i =0;i<n;i++){
                if (arr[i]>(int) avg){
                    count++;
                }
            }

            double bb = count/n * 100000;
            long round = Math.round(bb);
            double result = round / 1000.0;

            System.out.printf("%.3f%%\n",result);
        }
    }
}
