package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class solve_2870 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

       List<BigInteger> list = new ArrayList<>();
        for(int i = 0; i<n;i++){
            String line = br.readLine();
            StringBuilder sb = new StringBuilder();

            for(int j =0; j<line.length();j++){
                char c = line.charAt(j);
                if(c >= '0' && c <= '9'){
                    sb.append(c);
                }else{
                    if(!sb.isEmpty()){
                        list.add(new BigInteger(sb.toString()));
                        sb.setLength(0);
                    }
                }
            }
            if(!sb.isEmpty()){
                list.add(new BigInteger(sb.toString()));
            }
        }

        Collections.sort(list);

        StringBuilder out = new StringBuilder();
        for (BigInteger bigInteger : list) {
            out.append(bigInteger).append("\n");
        }
        System.out.println(out);
    }
}
