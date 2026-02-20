package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class solve_20310 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int zero = 0;
        int one = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') zero++;
            else one++;
        }

        int removeZero = zero / 2;
        int removeOne = one / 2;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '1' && removeOne > 0) {
                removeOne--;
                continue;
            }

            result.append(c);
        }

        for (int i = result.length() - 1; i >= 0 && removeZero > 0; i--) {
            if (result.charAt(i) == '0') {
                result.deleteCharAt(i);
                removeZero--;
            }
        }

        System.out.println(result);
    }
}
