package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_20438 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] sleep = new boolean[N + 3];
        boolean[] attend = new boolean[N + 3];

        if(K > 0){
            st = new StringTokenizer(br.readLine());
            for(int i =0; i<K; i++){
                int x = Integer.parseInt(st.nextToken());
                sleep[x] = true;
            }
        }else{
            br.readLine();
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i< Q;i++){
            int code = Integer.parseInt(st.nextToken());

            if(sleep[code])continue;

            for(int j = code; j <= N+2; j+= code){
                if(!sleep[j]){
                    attend[j] = true;
                }
            }
        }

        int[] prefix = new int[N+3];
        for(int i =3; i<= N + 2; i++){
            prefix[i] = prefix[i-1] + (attend[i] ? 0 : 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i =0; i< M;i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            int result = prefix[E] - prefix[S - 1];
            sb.append(result).append('\n');
        }
        System.out.println(sb);

    }
}
