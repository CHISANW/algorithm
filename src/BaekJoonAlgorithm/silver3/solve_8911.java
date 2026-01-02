package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_8911 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- >0){
            String commands = br.readLine();

            int x = 0;
            int y = 0;
            int dir = 0;

            int maxX = 0,minX = 0, minY = 0, maxY = 0;

            for(char c : commands.toCharArray()){
                // 한칸이동
                if (c == 'F') {
                    if(dir == 0 ) y++;
                    else if(dir == 1) x++;
                    else if(dir == 2) y--;
                    else x--;

                }else if(c == 'B'){// 뒤로 이동
                    if(dir == 0 ) y--;
                    else if(dir == 1) x--;
                    else if(dir == 2) y++;
                    else x++;
                }else if(c == 'L') { // 왼쪽 회전
                    dir = (dir + 3) % 4;
                }else if(c == 'R'){
                    dir = (dir + 1) % 4;
                }

                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            int with = maxX - minX;
            int height = maxY - minY;
            sb.append(with * height).append("\n");
        }
        System.out.println(sb);
    }
}
