package BaekJoonAlgorithm.브루트포스;

import java.util.Scanner;

public class 판화 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        String command = stdIn.hasNext()? stdIn.next(): "";

        boolean[][] passVertical = new boolean[n][n];
        boolean[][] passHorizontal = new boolean[n][n];

        int curR =0,curC=0;

        for (int i =0;i<command.length();i++){
            char cmd = command.charAt(i);
            if (cmd=='D'){
                if(curR==n-1) continue;
                passVertical[curR][curC] = passVertical[curR+1][curC]=true;
                curR++;
            }
            else if (cmd=='U'){
                if(curR==0) continue;
                passVertical[curR][curC] = passVertical[curR-1][curC]=true;
                curR--;
            }
            else if (cmd=='L'){
                if(curC==0) continue;
                passHorizontal[curR][curC] = passHorizontal[curR][curC-1]=true;
                curC--;
            }else {
                if(curC==n-1) continue;
                passHorizontal[curR][curC] = passHorizontal[curR][curC+1]=true;
                curC++;
            }
        }

        for (int i = 0; i < n; i++) {
            StringBuilder ans = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (passVertical[i][j] && passHorizontal[i][j]) ans.append("+");
                else if (passVertical[i][j]) ans.append("|");
                else if (passHorizontal[i][j]) ans.append("-");
                else ans.append(".");
            }
            System.out.println(ans);
        }

    }
}
