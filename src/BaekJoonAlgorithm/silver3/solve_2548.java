package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_2548 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        List<Pair> list = new ArrayList<>();

        for(int i =0; i<n;i++){
            int now = arr[i];
            int value = 0;
            for(int j = 0; j<n;j++){
                value += Math.abs(arr[j]-now);
            }
            list.add(new Pair(now, value));
        }
        Collections.sort(list);
        System.out.println(list.get(0).key);

    }
    static class Pair implements Comparable<Pair>{
        int key;
        int sum;

        public Pair(int key, int sum) {
            this.key = key;
            this.sum = sum;
        }

        @Override
        public int compareTo(Pair o) {
            if(o.sum == this.sum) return this.key - o.key;
            return this.sum - o.sum;
        }
    }
}
