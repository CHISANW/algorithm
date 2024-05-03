package BaekJoonAlgorithm.스택큐덱.큐;

import java.util.*;

public class 프린터큐 {
    public static class job{
        int index;
        int pro;

        public job(int index, int pro) {
            this.index = index;
            this.pro = pro;
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int T = stdIn.nextInt();

        while (T-->0){
            int N = stdIn.nextInt();
            int M = stdIn.nextInt();

            Queue<job> q = new LinkedList<>();
            Integer[] arr = new Integer[N];

            for (int i =0;i<N;i++){
                arr[i] = stdIn.nextInt();
                q.offer(new job(i,arr[i]));
            }

            Arrays.sort(arr, Collections.reverseOrder());

            for (int i =0;i<N;i++){
                while (q.peek().pro!=arr[i])
                    q.offer(q.poll());

                if (q.peek().index==M){
                    System.out.println(i+1);
                    break;
                }
                q.poll();
            }
        }
    }
}
