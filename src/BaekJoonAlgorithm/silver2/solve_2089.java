package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_2089 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        if(n == 0){
            System.out.println("0");
            return;
        }

        StringBuilder sb = new StringBuilder();

        while (n!=0){
            int remainder = n % -2;
            n = n / -2;

            if(remainder < 0){
                remainder += 2;
                n +=1;
            }
            sb.append(remainder);
        }
        System.out.println(sb.reverse());
    }
}
