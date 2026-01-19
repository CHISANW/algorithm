package programmers.level_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class solve_2942 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        List<Integer> list = getCommonDivisors(r, c);

        StringBuilder sb = new StringBuilder();
        for (Integer i : list) {
            sb.append(i).append(" ").append(r/i).append(" ").append(c/i).append("\n");
        }

        System.out.println(sb.toString());
    }

    static int gcd(int a, int b){
        while (b != 0){
            int temp = b;
             b = a % b;
             a = temp;
        }
        return  a;
    }

    static List<Integer> getCommonDivisors(int a, int b){
        int gcd = gcd(a, b);
        List<Integer> result = new ArrayList<>();

        for(int i =1 ; i*i <=gcd; i++){
            if(gcd % i == 0){
                result.add(i);
                if(i != gcd / i )
                    result.add(gcd / i);
            }
        }

        Collections.sort(result);
        return result;
    }
}
