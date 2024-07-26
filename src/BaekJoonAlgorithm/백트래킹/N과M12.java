package BaekJoonAlgorithm.백트래킹;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class N과M12 {
    static int[] nums;
    static int[] output;
    static boolean[] visited;
    static int n, m;
    static LinkedHashSet<String> set;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        output = new int[m];
        nums = new int[n];
        visited = new boolean[n];
        set = new LinkedHashSet<>();

        for(int i =0; i<n;i++){
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);

        backTracking(0, 0);
        set.forEach(System.out::println);
    }

    static void backTracking(int depth,int start){
        if(depth== m){
            StringBuilder sb = new StringBuilder();
            for(int i : output) {
                sb.append(i + " ");
            }
            set.add(sb.toString());
            return;
        }

        for(int i =start; i<n;i++){
            output[depth] = nums[i];
            backTracking(depth+1, i);
        }
    }
}
