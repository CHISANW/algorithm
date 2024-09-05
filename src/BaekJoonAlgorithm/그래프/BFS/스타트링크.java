package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 스타트링크 {
    static int f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        f = sc.nextInt();   // 총 층
        int s = sc.nextInt();   // 현재 위치
        int g = sc.nextInt();   // 면접 층수
        int u = sc.nextInt();   // 위로가는 층수
        int d = sc.nextInt();   // 아래로가는 층수

        Queue<Point> q = new LinkedList<>();
        boolean[] visited = new boolean[f + 1];
        visited[s] = true;
        q.add(new Point(s,0));

        int ans = Integer.MAX_VALUE;

        while (!q.isEmpty()){
            Point now = q.poll();
            int nowStage = now.r;
            int nowCount = now.count;
            if (nowStage == g){
                ans = Math.min(ans, nowCount);
                break;
            }

//            if(!isRange(nowStage)) continue;
            if (u!=0 && isRange(nowStage+u) && !visited[nowStage+u]){
                visited[nowStage+u] = true;
                q.add(new Point(nowStage + u, nowCount + 1));
            }
            if (d!=0 && isRange(nowStage-d) && !visited[nowStage-d]) {
                visited[nowStage-d] =true;
                q.add(new Point(nowStage - d, nowCount + 1));
            }
        }

        if (ans==Integer.MAX_VALUE) System.out.println("use the stairs");
        else System.out.println(ans);
    }

    static boolean isRange(int row){
        return row>=1 && row<=f;
    }
    static class Point{
        int r;
        int count;

        public Point(int r,int count){
            this.r = r;
            this.count = count;
        }
    }
}
