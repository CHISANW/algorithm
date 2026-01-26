package BaekJoonAlgorithm.silver2;

import java.io.*;
import java.util.*;

public class solve_8989 {

    static class Time {
        int h, m;
        double angle;
        int totalMinute;

        Time(String s) {
            String[] parts = s.split(":");
            this.h = Integer.parseInt(parts[0]);
            this.m = Integer.parseInt(parts[1]);
            this.totalMinute = h * 60 + m;
            this.angle = calcAngle(h, m);
        }

        static double calcAngle(int h, int m) {
            double hourAngle = (h % 12) * 30 + m * 0.5;
            double minuteAngle = m * 6;
            double diff = Math.abs(hourAngle - minuteAngle);
            return Math.min(diff, 360 - diff);
        }

        String format() {
            return String.format("%02d:%02d", h, m);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Time> list = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                list.add(new Time(st.nextToken()));
            }

            list.sort((a, b) -> {
                if (Double.compare(a.angle, b.angle) != 0) {
                    return Double.compare(a.angle, b.angle);
                }
                return Integer.compare(a.totalMinute, b.totalMinute);
            });

            sb.append(list.get(2).format()).append("\n");
        }

        System.out.print(sb);
    }
}
