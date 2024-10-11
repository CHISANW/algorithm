package BaekJoonAlgorithm.구현;

import java.util.*;
import java.io.*;

public class 십자가찾기 {
    static char[][] board;
    static boolean[][] visited;
    static List<Node> answer = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        board = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int size = 0;
                if (board[i][j] == '*') {
                    for (int k = 0; ; k++) {
                        if (i - k >= 0 && j - k >= 0 && i + k < n && j + k < m){
                            if (board[i-k][j] == '*' && board[i+k][j] == '*' && board[i][j-k] == '*' && board[i][j+k]=='*'){
                                size =k;
                            }else{
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                }
                if (size>0){
                    visited[i][j] = true;

                    for (int k =size ; k>0;k--){
                        answer.add(new Node(i+1,j+1,k));
                        visited[i+k][j] = true;
                        visited[i-k][j] = true;
                        visited[i][j-k] = true;
                        visited[i][j+k] = true;
                    }
                }
            }
        }

        for (int i =0; i<n;i++){
            for (int j =0; j<m;j++){
                if (board[i][j]=='*' && !visited[i][j]){
                    System.out.println(-1);
                    return;
                }
            }
        }

        sb.append(answer.size()).append("\n");

        for (Node node : answer){
            sb.append(node.r).append(" ").append(node.c).append(" ").append(node.s).append("\n");
        }
        System.out.println(sb);

    }

    static class Node {
        int r;
        int c;
        int s;

        public Node(int r, int c, int s) {
            this.r = r;
            this.c = c;
            this.s = s;
        }
    }
}
