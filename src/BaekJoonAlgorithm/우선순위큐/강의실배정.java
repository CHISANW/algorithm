package BaekJoonAlgorithm.우선순위큐;

import java.io.*;
import java.util.*;

public class 강의실배정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Point> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            list.add(new Point(start,end));
        }

        Collections.sort(list, (o1, o2) -> o1.start - o2.start);

        pq.add(list.get(0).end);

        for (int i =1; i<list.size();i++){
            Point point = list.get(i);
            int start = point.start;
            int end = point.end;

            if (pq.peek() <= start){
                pq.poll();
            }

            pq.add(end);
        }

        System.out.println(pq.size());

    }
    static class Point{
        int start,end;

        public Point(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
