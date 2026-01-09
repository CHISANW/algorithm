package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1004 {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    static boolean inside(int x, int y, int cx, int cy, int r) {
        long dx = x - (long) cx;
        long dy = y - (long) cy;
        long dist2 = dx * dx + dy * dy;
        long r2 = (long) r * r;
        return dist2 < r2; // 경계 위는 없다고 했으니 < 로 충분
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        String tStr = fs.next();
        if (tStr == null) return;
        int T = Integer.parseInt(tStr);

        StringBuilder sb = new StringBuilder();
        for (int tc = 0; tc < T; tc++) {
            int x1 = fs.nextInt();
            int y1 = fs.nextInt();
            int x2 = fs.nextInt();
            int y2 = fs.nextInt();

            int n = fs.nextInt();
            int ans = 0;

            for (int i = 0; i < n; i++) {
                int cx = fs.nextInt();
                int cy = fs.nextInt();
                int r = fs.nextInt();

                boolean inStart = inside(x1, y1, cx, cy, r);
                boolean inEnd = inside(x2, y2, cx, cy, r);

                if (inStart ^ inEnd) ans++; // 서로 다르면 경계 1번 통과
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}
