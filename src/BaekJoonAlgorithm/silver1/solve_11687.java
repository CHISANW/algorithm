package BaekJoonAlgorithm.silver1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_11687 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long M = Long.parseLong(br.readLine());

        long left = 0;
        long right = 5 * M;
        long answer = -1;

        while (left <= right){
            long mid = (left + right) / 2;
            long count = zeroCount(mid);
            if(count >= M){
                if(count == M){
                    answer = mid;
                }
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        System.out.println(answer);
    }

    static long zeroCount(long value){
        long sum = 0;
        while (value > 0){
            value /= 5;
            sum += value;
        }
        return sum ;
    }
}
