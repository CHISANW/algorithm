package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 달이차오른다가자 {
    static char[][] maze;
    static int[][][] distance;
    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};
    static int n,m;
    static final int DOOR = 1;
    static final int KEY = 2;
    static final int EXIT = 3;
    static final int WALL= 4;
    static final int NONE= 5;
    static Queue<Point> q ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        maze = new char[n][m];
        distance = new int[n][m][1<<6];     //2의 6승 비트마스크
        q = new LinkedList<>();

        for(int i =0;i<n;i++){
            String line = sc.next();
            for(int j =0; j<m;j++){
                char c = line.charAt(j);
                maze[i][j] = c;
                if(c == '0'){
                    q.add(new Point(i,j,0));
                    distance[i][j][0] = 1;
                }
            }
        }

        bfs();

    }

    static void bfs(){
        while(!q.isEmpty()) {
            Point now = q.poll();

            if(maze[now.r][now.c] == '1'){
                System.out.println(distance[now.r][now.c][now.key]);
                return;
            }

            for(int i =0 ; i<4;i++){
                int nr = now.r + dr[i];
                int nc = now.c + dc[i];
                if(isOutOfRange(nr, nc)) continue;
                int next = maze[nr][nc];        // 다음 번에 탐색할 위치의 값이 어떤 값인지 확인

                switch(getType(next)){              //switch 문으로 Type을 검사
                    case WALL -> {
                        continue;
                    }
                    case NONE ->{       //현재 위치가 아무것도 행동하지 않을 때
                        if(distance[nr][nc][now.key] == 0) {
                            q.add(new Point(nr,nc,now.key));
                            distance[nr][nc][now.key] =  distance[now.r][now.c][now.key]+1;
                        }
                    }
                    case KEY -> {
                        int key =  now.key |  (1<<(next-'A'));      //현재 키와 해당 필드에 도달한 키를 or 연산으로 키를 추가해준다.
                        if(distance[nr][nc][key]==0) {
                            q.add(new Point(nr, nc, key));
                            distance[nr][nc][key] =  distance[now.r][now.c][now.key]+1;
                        }
                    }
                    case DOOR -> {
                        if((now.key & (1<<(next-'A'))) == 0)  continue; // 현재 소지한 키와 문을 만 났을때 and 연산을 통해 0이라는것은 두개의 키가 일치하지 않는다고 볼수있음  -> 00101 & 00101 => 00101

                        if(distance[nr][nc][now.key]==0) {      //현재 방문하지 않은 곳이라면
                            q.add(new Point(nr,nc, now.key));
                            distance[nr][nc][now.key] =  distance[now.r][now.c][now.key]+1;
                        }
                    }
                    case EXIT -> {
                        System.out.println(distance[now.r][now.c][now.key]);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);

    }

    static int getType(int c){
        if(c == '#') return WALL;       //문일때
        else if(c=='.' || c=='0') return NONE;  // 이동하거나 처음 위치일때
        else if(c>='a' && c <='z') return KEY;  // 현재위치에 키가 있을때
        else if(c>='A' && c <='Z')return DOOR;  // 현재 문일때
        else return EXIT;
    }
    
    //범위 체크
    static boolean isOutOfRange(int r, int c){
        return r<0 || r>=n || c<0 || c>=m;
    }

    //Point 클래스
    static class Point{
        int r, c, key;

        public Point(int r, int c, int key){
            this.r = r;
            this.c = c;
            this.key =key;
        }
    }
}
