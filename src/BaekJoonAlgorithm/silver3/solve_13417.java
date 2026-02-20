package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_13417 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] chars = new char[n];
            for(int i =0; i<n;i++){
                chars[i] = st.nextToken().charAt(0);
            }
            int start = chars[0] - 'A';
            StringBuilder result = new StringBuilder(String.valueOf(chars[0]));

            for(int i =1 ; i<n;i++){
                int now = chars[i] - 'A';
                if(now <= start){
                    result.insert(0, chars[i]);
                    start = now;
                }else{
                    result.append(chars[i]);
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);

    }
}
