package BaekJoonAlgorithm.그리디;

import java.util.Scanner;

public class 전자레인지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        boolean a = true;
        int[] time = {300,60,10};
        int[] ans  = new int[3];
        for(int i =0;i<3;i++){
            ans[i] = t/time[i];
            t = t % time[i];
        }

        if(t!=0){
            System.out.println(-1);
        }else{
            for(int i : ans){
                System.out.print(i+" ");
            }
        }
    }
}
