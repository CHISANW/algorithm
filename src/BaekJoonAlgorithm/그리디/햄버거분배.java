package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 햄버거분배 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String str = sc.next();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if (c == 'P') arr[i] = 1;
            else arr[i] = 0;
        }

        int count = 0;

        for(int i =0; i<n;i++){
            boolean check =false;
            if (arr[i]== 1){
                for (int j = k;j>=1;j--){
                    if (i-j >= 0){
                        if (arr[i-j]==0){
                            check =true;
                            arr[i-j] = 2;
                            count++;
                            break;
                        }
                    }
                }

                if (!check){
                    for (int j = 1; j<=k;j++){
                        if (i+j<n){
                            if (arr[i+j]==0){
                                arr[i+j] = 2;
                                count++;
                                break;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
