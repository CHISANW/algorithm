package programmers.level_2;

import java.util.Arrays;

public class 우박수열정적분 {
    public static void main(String[] args) {
        int[][] ranges = {{0,0},{0,-1},{2,-3},{3,-3}};
        System.out.println(Arrays.toString(ranges)); // result -> [33.0,31.5,0.0,-1.0]

        int[][] ranges1 ={{0,0}, {1,-2}, {3,-3}};
        System.out.println(Arrays.toString(ranges1));   //result -> [47.0,36.0,12.0]
    }

    public static double[] solution(int k, int[][] ranges) {
        int n = getCount(k);

        // Collatz 수열 계산
        double[] yValue = new double[n + 1];
        yValue[0] = k;
        for (int i = 1; i <= n; i++) {
            double value = yValue[i - 1];
            if (value % 2 == 0) {
                yValue[i] = value / 2;
            } else {
                yValue[i] = value * 3 + 1;
            }
        }

        // 사다리꼴 넓이 계산
        double[] area = new double[n];
        for (int i = 0; i < n; i++) {
            area[i] = (yValue[i] + yValue[i + 1]) / 2;
        }

        // 누적합 계산
        double[] prefixSum = new double[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + area[i];
        }

        // 결과 계산
        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++) {
            int s = ranges[i][0];
            int e = n + ranges[i][1];

            if (e > s) {
                double val = prefixSum[e] - prefixSum[s];
                answer[i] = Double.parseDouble(String.format("%.1f", val));
            } else if (s > e) {
                answer[i] = -1.0;
            } else {
                answer[i] = 0.0;
            }
        }

        return answer;
    }

    static int getCount(int k) {
        int count = 0;
        while (k > 1) {
            if (k % 2 == 0) {
                k /= 2;
            } else {
                k = k * 3 + 1;
            }
            count++;
        }
        return count;
    }
}
