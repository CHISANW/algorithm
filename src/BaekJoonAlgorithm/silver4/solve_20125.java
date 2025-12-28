package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class solve_20125 {
    static int n;
    static char[][] map;
    public static void main(String[] args)  throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        map = new char[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String line = br.readLine();
            for (int j = 1; j <= n; j++) {
                map[i][j] = line.charAt(j - 1);
            }
        }

        int headR = 0, headC = 0;
        outer:
        for(int i =1; i<=n;i++){
            for(int j =1; j<=n;j++){
                if(map[i][j] == '*'){
                    headR = i;
                    headC = j;
                    break outer;
                }
            }
        }

        int heartR = headR + 1;
        int heartC = headC;

        int leftArm =0;
        for(int c = heartC -1; c>=1 && map[heartR][c] == '*'; c--){
            leftArm++;
        }

        int rightArm =0;
        for(int c = heartC +1; c<=n && map[heartR][c] == '*'; c++){
            rightArm++;
        }

        int body = 0;
        int bodyEndR = heartR;
        for(int i = heartR +1; i<= n && map[i][heartC] == '*'; i++){
            body++;
            bodyEndR =i;
        }

        int leftLeg = 0;
        for(int i = bodyEndR +1; i<=n && map[i][heartC - 1] == '*'; i++){
            leftLeg++;
        }

        int rightLeg = 0;
        for(int i = bodyEndR +1; i<=n && map[i][heartC + 1] == '*'; i++){
            rightLeg++;
        }

        System.out.println(heartR + " " + heartC);
        System.out.println(leftArm + " " + rightArm + " " + body + " " + leftLeg + " " + rightLeg);
    }

}
