package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] c = new int[n][5];

        for(int i =0; i<n;i++){
            for (int j =0; j<5;j++){
                c[i][j] = sc.nextInt();
            }
        }

        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (c[i][k] == c[j][k]) {
                        count[i]++;
                        break;
                    }
                }
            }
        }


        int max = -1;
        int leader = 0;
        for(int i =0 ; i< n;i++){
            if(max < count[i]){
                max = count[i];
                leader = i + 1;
            }
        }
        System.out.println(leader);
    }

}
