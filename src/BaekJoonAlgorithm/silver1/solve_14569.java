package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_14569 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] courses = new long[n];

        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            long mask = 0;

            for(int j =0;j<k;j++){
                int t = Integer.parseInt(st.nextToken());
                mask |= (1L << t);
            }
            courses[i] = mask;
        }

        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<m;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            long studentMask = 0;

            for(int j =0; j<p;j++){
                int t = Integer.parseInt(st.nextToken());
                studentMask |= (1L << t);
            }

            int count = 0;

            for (long courseMask : courses) {
                if ((courseMask & studentMask) == courseMask) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }
}
