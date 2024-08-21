package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 한줄로서기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];
        int[] answer = new int[n+1];

        for(int i = 1; i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 1;i<=n; i++){
            int j = 1;

            while (true){
                if (arr[i] == 0 && answer[j] == 0){
                    answer[j] = i;
                    break;
                }else if (answer[j] == 0) arr[i]--;

                j++;
            }
        }

        for (int i =1; i<=n; i++){
            System.out.print(answer[i] + " ");
        }
    }
}
