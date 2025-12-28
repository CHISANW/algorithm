package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;

public class solve_1755 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());


        String[] english = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };

        List<Pair> list = new ArrayList<>();

        for(int i = M ; i<=N ; i++){
            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder();

            for(int j = 0 ; j<s.length() ; j++){
                int digit = s.charAt(j) - '0';
                sb.append(english[digit]);
                if(j < s.length() -1) sb.append(" ");
            }
            list.add(new Pair(i, sb.toString()));
        }

        Collections.sort(list);

        StringBuilder output = new StringBuilder();
        int count = 0;
        for (Pair pair : list) {
            output.append(pair.num).append(" ");
            count++;
            if(count % 10 ==0){
                output.append("\n");
            }
        }
        System.out.println(output.toString().trim());
    }

    static class Pair implements Comparable<Pair>{
        int num;
        String text;

        public Pair(int num, String text) {
            this.num = num;
            this.text = text;
        }

        @Override
        public int compareTo(Pair o) {
            return this.text.compareTo(o.text);
        }
    }
}
