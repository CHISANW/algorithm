package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scenario = 1;

        while (true){
            int n = sc.nextInt();
            if(n == 0) break;

            sc.nextLine();
            String[] names = new String[n+1];
            for(int i = 1; i <= n;i++){
                names[i] = sc.nextLine();
            }

            int[] count = new int[n+1];
            for(int i = 0; i<2*n-1 ; i++){
                int num = sc.nextInt();
                String type = sc.next();
                count[num]++;
            }

            for(int i = 1; i<=n ;i++){
                if(count[i] == 1){
                    System.out.println(scenario + " " + names[i]);
                    break;
                }
            }
            scenario++;
        }

    }
}
