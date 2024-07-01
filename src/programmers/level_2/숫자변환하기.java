package programmers.level_2;

import java.util.*;

public class 숫자변환하기 {
    public static void main(String[] args) {

        System.out.println(solution(10,40,5)); //result 2;
        System.out.println(solution(10,40,30)); //result 1;
        System.out.println(solution(2,5,4)); //result -1;

    }

    public static int solution(int x, int y, int n){
        if( x== y) return 0;

        int max = Math.max(x, y)+n;
        int answer = -1;
        boolean[] check = new boolean[max+1];
        Queue<Point> q = new LinkedList<>();

        q.add(new Point(x,0));
        check[x] = true;

        while(!q.isEmpty()){
            Point poll = q.poll();
            int now = poll.x;
            int nowDist = poll.dist;

            if(now ==y){
                answer = nowDist;
                break;
            }

            if(now+n <= max && !check[now+n]){
                q.add(new Point((now+n),nowDist+1));
            }

            if(now*2 <= max && !check[now*2]){
                q.add(new Point((now*2),nowDist+1));
            }

            if(now*3 <= max && !check[now*3]){
                q.add(new Point((now*3),nowDist+1));
            }
        }
        return answer;
    }

    static class Point{
        int x;
        int dist;

        public Point(int x, int dist){
            this.x = x;
            this.dist = dist;
        }
    }
}
