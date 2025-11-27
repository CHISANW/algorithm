package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;

public class solve_5555 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            String temp = a+a;
            boolean contains = temp.contains(line);
            if(contains) ans++;
        }
        System.out.println(ans);
    }
}
