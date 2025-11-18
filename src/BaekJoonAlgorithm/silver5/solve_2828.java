package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_2828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int j = sc.nextInt();

        int start = 1;
        int end = m;

        int ans = 0;
        for(int i =0; i<j;i++){
            int distance = sc.nextInt();
            if(distance > end){
                ans += distance-end;
                start += distance-end;
                end = distance;
            }
            if(distance < start){
                ans += start-distance;
                end += start-distance;
                start = distance;
            }
        }
        System.out.println(ans);
    }
}
