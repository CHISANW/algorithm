package BaekJoonAlgorithm.silver5;

import java.util.Scanner;

public class solve_1817 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 0){
            System.out.println(0);
            return;
        }
        int boxCount = 1;
        int weight = 0;

        for(int i =0; i<n;i++){
            int boxWeight = sc.nextInt();
            int temp = weight + boxWeight;
            if(temp >m){
                boxCount++;
                weight = boxWeight;
            }else{
                weight = temp;
            }
        }

        System.out.println(boxCount);
    }
}
