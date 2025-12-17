package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solve_25192 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        int count = 0;
        for (int i =0 ;i< n;i++){
            String s = br.readLine();

            if(s.equals("ENTER")){
                count += set.size();
                set.clear();
            }else{
                set.add(s);
            }
        }
        count+=set.size();
        System.out.println(count);
    }
}
