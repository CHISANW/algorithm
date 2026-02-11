package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2477 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        int[] dir = new int[6];
        int[] len = new int[6];

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dir[i] = Integer.parseInt(st.nextToken());
            len[i] = Integer.parseInt(st.nextToken());
        }

        int maxW = 0, maxH = 0;
        int idxW = -1, idxH = -1;

        // 가장 긴 가로, 세로 찾기
        for (int i = 0; i < 6; i++) {
            if (dir[i] == 1 || dir[i] == 2) { // 가로
                if (len[i] > maxW) {
                    maxW = len[i];
                    idxW = i;
                }
            } else { // 세로 (3,4)
                if (len[i] > maxH) {
                    maxH = len[i];
                    idxH = i;
                }
            }
        }

        // 작은 사각형의 가로, 세로
        int smallH = Math.abs(len[(idxW + 5) % 6] - len[(idxW + 1) % 6]);
        int smallW = Math.abs(len[(idxH + 5) % 6] - len[(idxH + 1) % 6]);

        int area = (maxW * maxH - smallW * smallH) * K;
        System.out.println(area);
    }
}
