package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class solve_5648 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);

        ArrayList<Long> list = new ArrayList<>();

        int count = 0;
        for(int i = 1 ; i<first.length;i++){
            list.add(reverseLong(first[i]));
            count++;
        }

        while (count < n){
            String[] arr = br.readLine().split(" ");
            for(String s : arr){
                if(s.isEmpty()) continue;
                list.add(reverseLong(s));
                count++;
                if(count == n) break;
            }
        }

        Collections.sort(list);

        for (Long l : list) {
            System.out.println(l);
        }
    }

    private static long reverseLong(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return Long.parseLong(sb.toString());
    }
}
