package BaekJoonAlgorithm.백트래킹;

import java.util.*;

public class N과M9 {
    static int n, m;
    static int[] nums, perm;
    static boolean[] visited;
    static LinkedHashSet<String> ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        nums = new int[n];
        perm = new int[m];
        visited = new boolean[n];
        ans = new LinkedHashSet<>();

        for(int i =0; i<n;i++){
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        backTracking(0);

        ans.forEach(System.out::println);

    }

    static void backTracking(int depth){
        if(depth == m){
            StringBuilder sb = new StringBuilder();
           for(int p : perm){
               sb.append(p).append(" ");
           }
            ans.add(sb.toString());
            return;
        }

        for(int i =0; i<n;i++){
            if(!visited[i]){
                visited[i] = true;
                perm[depth] = nums[i];
                backTracking(depth+1);
                visited[i] = false;
            }
        }
    }
}
