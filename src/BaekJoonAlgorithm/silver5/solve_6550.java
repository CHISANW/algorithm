package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class solve_6550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.isEmpty()) continue;

            String[] parts = line.split(" ");
            String s = parts[0];
            String t = parts[1];

            int si = 0, ti = 0;

            while (si < s.length() && ti < t.length()) {
                if (s.charAt(si) == t.charAt(ti)) {
                    si++;
                }
                ti++;
            }

            if (si == s.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
