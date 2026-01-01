package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int count = 0;

        double radius = H / 2.0;
        double radiusSquared = radius * radius;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            int px = Integer.parseInt(st.nextToken());
            int py = Integer.parseInt(st.nextToken());


            if (px >= X && px <= X + W && py >= Y && py <= Y + H) {
                count++;
            }

            else {
                double dxLeft = px - X;
                double dy = py - (Y + radius);
                if (dxLeft * dxLeft + dy * dy <= radiusSquared) {
                    count++;
                }
                else {
                    double dxRight = px - (X + W);
                    if (dxRight * dxRight + dy * dy <= radiusSquared) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}