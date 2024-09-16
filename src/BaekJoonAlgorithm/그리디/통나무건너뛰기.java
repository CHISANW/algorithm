package BaekJoonAlgorithm.그리디;

import java.util.*;

public class 통나무건너뛰기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] temp = new int[n];
            int right = 0;
            int left = n-1;
            boolean flag = true;
            for (int i =0; i<n;i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            for (int i =0 ;i<n;i++){
                if (flag){
                    temp[right++] = arr[i];
                }else {
                    temp[left--] = arr[i];
                }
                flag = !flag;
            }

            int max = 0;
            for (int i =1; i<n;i++){
                max = Math.max(Math.abs(temp[i]- temp[i-1]),max);
            }

            max = Math.max(max, Math.abs(temp[n-1] - temp[0]));
            sb.append(max+"\n");
        }
        System.out.println(sb);
    }
}
