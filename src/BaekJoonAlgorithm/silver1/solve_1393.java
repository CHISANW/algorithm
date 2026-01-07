package BaekJoonAlgorithm.silver1;

import java.io.*;
import java.util.*;


public class solve_1393 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long xs = Long.parseLong(st.nextToken());
        long ys = Long.parseLong(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long xe = Long.parseLong(st.nextToken());
        long ye = Long.parseLong(st.nextToken());
        long dx = Long.parseLong(st.nextToken());
        long dy = Long.parseLong(st.nextToken());

        // 방향 벡터를 최소 정수 스텝으로 축약
        long g = gcd(dx, dy);
        long vx = dx / g;
        long vy = dy / g;

        // k 실수값(정사영): k* = ((S-E)·v) / |v|^2
        long sx = xs - xe;
        long sy = ys - ye;

        long vv = vx * vx + vy * vy; // |v|^2
        double kStar = ((double)(sx * vx + sy * vy)) / (double)vv;

        // 반직선이므로 k >= 0
        if (kStar < 0) kStar = 0;

        long bestK = 0;
        long bestX = xe, bestY = ye;
        long bestDist = (bestX - xs) * (bestX - xs) + (bestY - ys) * (bestY - ys);

        // k* 주변만 검사 (정수해 보장이라 근처에서 결정됨)
        long base = (long)Math.floor(kStar);
        for (long k = base - 3; k <= base + 3; k++) {
            if (k < 0) continue;
            long px = xe + k * vx;
            long py = ye + k * vy;
            long dxp = px - xs;
            long dyp = py - ys;
            long dist = dxp * dxp + dyp * dyp;

            // 거리 최소, 동률이면 더 이른 위치(작은 k)
            if (dist < bestDist || (dist == bestDist && k < bestK)) {
                bestDist = dist;
                bestK = k;
                bestX = px;
                bestY = py;
            }
        }

        System.out.println(bestX + " " + bestY);
    }

    static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
