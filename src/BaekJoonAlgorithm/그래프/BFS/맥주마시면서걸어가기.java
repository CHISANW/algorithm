package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 맥주마시면서걸어가기 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();  // 편의점 개수
            Point start = new Point(sc.nextInt(), sc.nextInt());
            List<Point> shops = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                shops.add(new Point(sc.nextInt(), sc.nextInt()));
            }

            Point end = new Point(sc.nextInt(), sc.nextInt());

            if (bfs(start, shops, end)) {
                System.out.println("happy");
            } else
                System.out.println("sad");
        }

    }

    static boolean bfs(Point start, List<Point> shops, Point end) {
        Queue<Point> q = new LinkedList<>();
        Set<Point> visited  = new HashSet<>();
        q.add(start);
        visited.add(start);

        while (!q.isEmpty()){
            Point now = q.poll();

            if (now.distance(end) <= 1000){
                return true;
            }

            for (Point shop : shops){
                if (!visited.contains(shop) && now.distance(shop)<=1000){
                    visited.add(shop);
                    q.add(shop);
                }
            }
        }
        return false;
    }

    static class Point {
        int row;
        int col;

        public Point(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public int distance(Point other) {
            return Math.abs(this.row - other.row) + Math.abs(this.col - other.col);
        }
    }
}
