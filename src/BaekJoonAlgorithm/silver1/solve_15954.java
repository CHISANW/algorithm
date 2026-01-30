package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_15954 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        double[] arr = new double[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n;i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        double answer = Double.MAX_VALUE;

        while (k <=n){
            for(int i =0; i<n-k;i++){

                double m = getM(arr, i, n, k);
                double b = getB(arr, m,i, n, k);

                answer = Math.min(answer, b);

            }
            k+=1;
        }
        System.out.printf("%.11f\n", answer);
    }

    public static double getM (double[] A, int idx, int N, int K) {
        double sum = 0.0;
        for(int i = 0; i < K; i++) {
            sum += A[idx+i];
        }
        return sum / K;
    }

    public static double getB(double[] A, double m, int idx, int N, int K) {
        double sum = 0.0;
        for(int i=0; i < K; i++) {
            sum += (Math.pow(A[idx+i]-m, 2));
        }
        return Math.sqrt(sum/K);
    }
}
