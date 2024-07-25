package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;
import java.io.*;

public class 토마토7569 {
    static int M, N, H;
    static int map[][][];
    static int count = 0;
    static int dx[] = {-1, 0, 1, 0, 0, 0};
    static int dy[] = {0, 1, 0, -1, 0, 0};
    static int dz[] = {0, 0, 0, 0, -1, 1};
    Queue<Node> Q = new LinkedList<>();

    class Node {
        int x, y, z, count;
        Node (int x, int y, int z, int count) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.count = count;
        }
    }

    void BFS() {
        while(!Q.isEmpty()) {
            Node now = Q.poll();
            for (int i=0; i<6; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                int nz = now.z + dz[i];

                if (nx<0 || nx>=N || ny<0 || ny>=M || nz<0 || nz>=H) continue;
                if (map[nx][ny][nz] == 1) continue;
                if (map[nx][ny][nz] == -1) continue;

                map[nx][ny][nz] = 1;
                Q.add(new Node(nx, ny, nz, now.count+1));
                count = now.count+1;
            }
        }
    }

    void Solve() {
        for (int k=0; k<H; k++) {
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    if (map[i][j][k] == 1) {
                        Q.add(new Node(i, j, k, 0));
                    }
                }
            }
        }
        if (Q.size() == N*M*H) {
            System.out.println(0);
            return;
        }

        BFS();
        for (int k=0; k<H; k++) {
            for (int i=0; i<N; i++) {
                for (int j=0; j<M; j++) {
                    if (map[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(count);
    }

    void inputData() throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());//열
        N = Integer.parseInt(st.nextToken());//행
        H = Integer.parseInt(st.nextToken());//높이
        map = new int[N][M][H];
        for (int k=0; k<H; k++) {
            for (int i=0; i<N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0; j<M; j++) {
                    map[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        토마토7569 m = new 토마토7569();
        m.inputData();
        m.Solve();
    }
}
