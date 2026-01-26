package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class solve_8989 {
    static class Time {
        String text;
        double angle;
        public Time(String text, double angle) {
            this.text = text;
            this.angle = angle;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Time[] arr = new Time[5];
            for (int i = 0; i < 5; i++) {
                String timeStr = br.readLine();
                StringTokenizer st = new StringTokenizer(timeStr, ":");
                int h = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());

                // 시침 각도
                double hourAngle = h * 30 + m * 0.5;
                // 분침 각도
                double minuteAngle = m * 6;
                // 두 각도 차
                double diff = Math.abs(hourAngle - minuteAngle);
                // 작은 각도
                double smaller = Math.min(diff, 360 - diff);

                arr[i] = new Time(timeStr, smaller);
            }

            // 각도 오름차순, 같으면 시간 문자열 사전 순
            Arrays.sort(arr, new Comparator<Time>() {
                @Override
                public int compare(Time t1, Time t2) {
                    if (t1.angle < t2.angle) return -1;
                    if (t1.angle > t2.angle) return 1;
                    return t1.text.compareTo(t2.text);
                }
            });

            // 가운데 값(3번째; index 2)
            System.out.println(arr[2].text);
        }
    }
}
