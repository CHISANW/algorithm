package BaekJoonAlgorithm.동적계획법;

import java.io.*;
import java.util.*;

public class 파이프옮기기1 {
    static int n;
    static int[][] map;
    static int ans;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        for(int i =1; i<=n;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=1;j<=n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        ans = 0;
        dfs(1,2,0);
        System.out.println(ans);
    }

    //direction 0 : 가로, 1 : 세로 , 2 : 대각성
    static void dfs(int x, int y, int direction){
        if(x ==n && y== n){
            ans++;
            return;
        }

        switch (direction){
            // 가로
            case 0 ->{
                if(y+1 <=n && map[x][y+1] ==0)
                    dfs(x, y+1,0);
            }
            // 세로
            case 1 ->{
                if(x+1 <=n && map[x+1][y]==0)
                    dfs(x+1, y, 1);
            }
            // 대각선일때
            case 2 ->{
                if(y+1 <=n && map[x][y+1] ==0)
                    dfs(x, y+1, 0);
                if(x+1 <=n && map[x+1][y]==0)
                    dfs(x+1, y, 1);
            }
        }
        //대각선 이동하기
        if (y + 1 <= n && x + 1 <= n && map[x][y + 1] == 0 && map[x + 1][y] == 0 && map[x + 1][y + 1] == 0) {
            dfs(x + 1, y + 1, 2);
        }
    }
}
