package BaekJoonAlgorithm.그리디;

import java.util.*;
import java.io.*;

public class 신입사원 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int num = Integer.parseInt(br.readLine());
            int[][] score = new int[num][2];

            for (int j = 0; j < num; j++) {
                String[] input = br.readLine().split(" ");
                score[j][0] = Integer.parseInt(input[0]);
                score[j][1] = Integer.parseInt(input[1]);
            }

            Arrays.sort(score, (o1, o2) -> o1[0] - o2[0]);

            int top = score[0][1];
            int cnt = 0;
            for (int j = 1; j < num; j++) {
                if (top < score[j][1]) {
                    cnt++;
                } else {
                    top = score[j][1];
                }
            }
            bw.write((num - cnt) + "\n");
        }
        bw.flush();
        bw.close();

    }
}
