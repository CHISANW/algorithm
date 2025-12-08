package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class solve_4158 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (true) {
            line = br.readLine();

            if (line == null) break;

            String[] arr = line.split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);

            if (n == 0 && m == 0) break;
            HashSet<Integer> set = new HashSet<>(n);
            int count = 0;

            for(int i = 0; i<n;i++){
                set.add(Integer.parseInt(br.readLine()));
            }

            for(int i = 0; i<m;i++){
                int value = Integer.parseInt(br.readLine());
                if(set.contains(value)) count++;
            }
            System.out.println(count);
        }
    }
}
