package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2823 {
    static int r, c;
    static char[][] map;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        map = new char[r][c];

        for(int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for(int i =0; i<r;i++){
            for(int j =0; j<c;j++){
                if(map[i][j] == '.'){
                    int cnt = 0;

                    for(int d =0; d<4;d++){
                        int nx = i + dx[d];
                        int ny = j + dy[d];

                        if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                        if(map[nx][ny] == '.') cnt++;
                    }

                    if(cnt<=1){
                        System.out.println(1);
                        return;
                    }
                }
            }
        }
        System.out.println(0);

    }
}
