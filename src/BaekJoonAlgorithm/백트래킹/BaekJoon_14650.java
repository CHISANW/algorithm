package BaekJoonAlgorithm.백트래킹;

import java.util.Scanner;

public class BaekJoon_14650 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        backTracking(n,"");
        System.out.println(count);
    }

    static void backTracking(int start ,String value){

        if (value.startsWith("0")){
            return;
        }

        if (value.length()==start){
            if (Integer.parseInt(value) % 3 ==0){
                count++;
            }
            return;
        }

        for (int i =0; i<3;i++){
            backTracking(start,value+i);
        }
    }
}
