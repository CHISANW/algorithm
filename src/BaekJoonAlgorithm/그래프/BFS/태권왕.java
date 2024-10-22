package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 태권왕 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int s = sc.nextInt();
            int t = sc.nextInt();

            int answer = bfs(s, t);
            System.out.println(answer);
        }
    }

    static int bfs(int s, int t) {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(s, 0, t));

        int min = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            Point now = q.poll();


            if (now.myScore == now.otherScore) {
                min = Math.min(now.count, min);
            }
            if (now.myScore < now.otherScore){
                q.add(new Point(now.myScore * 2, now.count + 1, now.otherScore + 3));
                q.add(new Point(now.myScore+1, now.count+1, now.otherScore));
            }
        }

        return min;
    }

    static class Point {
        int myScore;
        int count;
        int otherScore;

        public Point(int myScore, int count, int otherScore) {
            this.myScore = myScore;
            this.count = count;
            this.otherScore = otherScore;
        }
    }
}
