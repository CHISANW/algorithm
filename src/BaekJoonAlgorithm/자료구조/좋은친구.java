package BaekJoonAlgorithm.자료구조;

import java.util.*;

public class 좋은친구 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n];
        long sum = 0;

        for(int i =0; i<n;i++){
            String str = sc.next();
            students[i] = str.length();
        }

        int[] friends = new int[21];
        Queue<Integer> q= new LinkedList<>();

        for(int i =0; i<n;i++){
            int next = students[i];
            sum += friends[next];
            q.add(next);
            friends[next]++;
            if (q.size() > k){
                Integer out = q.poll();
                friends[out]--;
            }
        }

        System.out.println(sum);
    }
}
