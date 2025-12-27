package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_17266 {
    static int N, M;
    static int[] x;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        x = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0; i<M;i++){
            x[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = N;
        int ans = N;

        while (left <= right){
            int mid = (left + right) / 2;

            if(isPossible(mid)){
                ans = mid;
                right = mid -1;
            }else{
                left = mid +1;
            }
        }

        System.out.println(ans);
    }

    static boolean isPossible(int h){

        if(x[0] - h >0) return false;

        for(int i =0; i<M-1;i++){
            if(x[i+1] - x[i] > 2*h) return  false;
        }

        if(x[M-1] + h <N) return false;

        return true;
    }
}
