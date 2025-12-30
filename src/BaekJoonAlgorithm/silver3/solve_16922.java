package BaekJoonAlgorithm.silver3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solve_16922 {
    static int[] values = {1, 5, 10, 50};
    static Set<Integer> set = new HashSet<>();
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        backTracking(0, 0, 0);
        System.out.println(set.size());

    }

    static void backTracking(int depth, int start , int sum){
        if(depth == n){
            set.add(sum);
            return;
        }

        for(int i =start; i<4;i++){
            backTracking(depth+1, i, sum+values[i]);
        }

    }
}
