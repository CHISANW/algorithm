package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_23304 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String answer = "AKARAKA";
        while (input.length() > 1){
            if(!checkP(input)){
                answer = "IPSELENTI";
                break;
            }
            int dived = input.length() / 2;
            input = input.substring(0,dived);
        }

        System.out.println(answer);


    }

    static boolean checkP(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.toString().equals(sb.reverse().toString());
    }
}
