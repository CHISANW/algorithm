package BaekJoonAlgorithm.재귀호출.백트래킹;

import java.util.*;


public class 좋은수열 {
    static int n;
    static int[] numbers = new int[80];

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        solve(0);
    }

    static boolean solve(int endIndex){
        if(endIndex == n){
            for(int i =0;i<n;i++){
                System.out.print(numbers[i]);
            }
            return true;
        }else{
            for(int i =1;i<=3;i++){
                numbers[endIndex] = i;
                if(!isBad(endIndex)){
                    if(solve(endIndex +1)) return  true;
                }
            }
        }
        return false;
    }

    static boolean isBad(int endIndex){
        for(int i =1; i<=(endIndex+1)/2;i++){
            boolean same = true;
            for(int j = 0;j<i;j++){
                if(numbers[endIndex-j] != numbers[endIndex-i-j]){
                    same = false;
                    break;
                }
            }
            if(same) return true;
        }
        return false;
    }
}
