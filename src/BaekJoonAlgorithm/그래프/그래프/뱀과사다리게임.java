package BaekJoonAlgorithm.그래프.그래프;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 뱀과사다리게임 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] board = new int[101];
        for(int i =1;i<=100;i++){
            board[i] = i;
        }

        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            board[x] =y;
        }

        for(int i = 0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            board[u] = v;
        }
        int answer =bfs(board);
        System.out.println(answer);
    }

    static int bfs(int[] board){
        boolean[] visited = new boolean[101];
        Queue<Point> q = new LinkedList<>();

        visited[1] = true;
        q.add(new Point(1,0));

        while (!q.isEmpty()){
            Point now = q.poll();
            int position = now.position;

            if (position == 100){
                return now.distance;
            }

            for(int i =1 ;i<=6;i++){
                int nextPosition = position + i;
                if(nextPosition <= 100 && !visited[nextPosition]){
                    visited[nextPosition] = true;
                    q.add(new Point(board[nextPosition], now.distance+1));
                }
            }
        }

        return -1;
    }

    static class Point{
        int position;
        int distance;

        public Point(int position, int distance){
            this.position = position;
            this.distance = distance;
        }
    }
}
