package BaekJoonAlgorithm.그래프.BFS;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class BaekJoon_18232 {
    static int n,m,start,end;
    static Map<Integer, List<Integer>> map = new HashMap<>();
    static boolean[] visited;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        visited = new boolean[n+1];

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        for (int i = 0; i<m;i++){
            st= new StringTokenizer(br.readLine());
            int telStart = Integer.parseInt(st.nextToken());
            int telEnd = Integer.parseInt(st.nextToken());
            map.computeIfAbsent(telStart, k -> new ArrayList<>()).add(telEnd);
            map.computeIfAbsent(telEnd, k -> new ArrayList<>()).add(telStart);
        }

        bfs();

    }

    static void bfs(){
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(start,0));
        visited[start] = true;

        while (!q.isEmpty()){
            Point now = q.poll();

            int x = now.x;
            if (x == end) {
                System.out.println(now.count);
                return;
            }

            if (map.containsKey(x)) {
                for (Integer next : map.get(x)) {
                    if (!visited[next]) {
                        visited[next] = true;
                        q.add(new Point(next, now.count + 1));
                    }
                }
            }

            if (isRange(x + 1) && !visited[x + 1]) {
                visited[x + 1] = true;
                q.add(new Point(x + 1, now.count + 1));
            }
            if (isRange(x - 1) && !visited[x - 1]) {
                visited[x - 1] = true;
                q.add(new Point(x - 1, now.count + 1));
            }

        }
    }

    static boolean isRange(int x){
        return  x>=1 && x<=n;
    }

    static class Point{
        int x;
        int count;

        public Point(int x, int count) {
            this.x = x;
            this.count = count;
        }
    }
}
