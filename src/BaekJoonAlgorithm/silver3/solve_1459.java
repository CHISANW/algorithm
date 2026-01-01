package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_1459 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long w = Long.parseLong(st.nextToken());
        long s = Long.parseLong(st.nextToken());

        long min = Math.min(x, y);
        long max = Math.max(x, y);
        long diff = max - min;
        long case1 = (x+y)*w;
        long case2 = min * s + diff * w;
        long case3;
        if(diff %2 == 0){
            case3 = max * s;
        }else{
            case3 = (max -1 ) * s + w;
        }

        System.out.println(Math.min(case1, Math.min(case2, case3)));
    }
}
