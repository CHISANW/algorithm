package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class 불 {
    static int n , m;
    static int[][] visited;
    static int[][] fire;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            n = sc.nextInt();       // col
            m = sc.nextInt();       // row

            visited = new int[m][n];
            fire = new int[m][n];

            Queue<Point> q = new LinkedList<>();        // 상근이 큐
            Queue<Point> fq = new LinkedList<>();       // 불난곳 큐

            
            // 초기값 세팅
            for(int i =0;i<m;i++){
                String line = sc.next();
                for(int j =0;j<n;j++){
                    char cmd = line.charAt(j);
                    if(cmd == '#'){     // 벽 일때
                        visited[i][j] = fire[i][j] = -1;
                    }
                    else if(cmd == '*'){          // 불 위치
                        fire[i][j] =1;
                        fq.add(new Point(i,j));
                    }else if(cmd =='@'){         //상근이 위치
                        visited[i][j] = 1;
                        q.add(new Point(i,j));
                    }
                }
            }

            //불난위치 계산

            while(!fq.isEmpty()){
                Point now = fq.poll();
                for(int i =0;i<4;i++){
                    int nr = now.r+dr[i];       // 다음 로우 좌표
                    int nc = now.c+dc[i];       // 다음 행 좌표
                    if(isRange(nr,nc)) continue;
                    if(fire[nr][nc]==0){
                        fire[nr][nc] = fire[now.r][now.c]+1;
                        fq.add(new Point(nr,nc));
                    }
                }
            }

            // 상근이의 탈출 계산
            boolean isEscaped = false;
            while(!q.isEmpty()){
                Point now = q.poll();
                if(isExit(now.r,now.c)){
                    isEscaped = true;
                    System.out.println(visited[now.r][now.c]);
                    break;
                }
                for(int i =0;i<4;i++){
                    int nr = now.r+dr[i];       // 다음 로우 좌표
                    int nc = now.c+dc[i];       // 다음 행 좌표
                    if(isRange(nr,nc)) continue;
                    if(visited[nr][nc]!=0) continue;
                    if(fire[nr][nc]==0 || fire[nr][nc] > visited[now.r][now.c]+1){
                        visited[nr][nc] = visited[now.r][now.c]+1;
                        q.add(new Point(nr,nc));
                    }
                }
            }

            if(!isEscaped)
                System.out.println("IMPOSSIBLE");

        }
    }

    static boolean isExit(int r, int c){
        return r==0 || r==m-1 || c==0 || c==n-1;
    }
    static boolean isRange(int r, int c){
        return r<0 || r>=m || c<0 || c>=n;
    }
}
