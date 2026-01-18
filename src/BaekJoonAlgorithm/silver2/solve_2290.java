package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class solve_2290 {
    static String[][] pattern = {
            {" - ", "| |", "   ", "| |", " - "}, // 0
            {"   ", "  |", "   ", "  |", "   "}, // 1
            {" - ", "  |", " - ", "|  ", " - "}, // 2
            {" - ", "  |", " - ", "  |", " - "}, // 3
            {"   ", "| |", " - ", "  |", "   "}, // 4
            {" - ", "|  ", " - ", "  |", " - "}, // 5
            {" - ", "|  ", " - ", "| |", " - "}, // 6
            {" - ", "  |", "   ", "  |", "   "}, // 7
            {" - ", "| |", " - ", "| |", " - "}, // 8
            {" - ", "| |", " - ", "  |", " - "}  // 9
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        String n = st.nextToken();

        int rows = 2 * s + 3;
        StringBuilder[] output = new StringBuilder[rows];
        for (int i = 0; i < rows; i++) {
            output[i] = new StringBuilder();
        }

        for (int idx = 0; idx < n.length(); idx++) {
            int digit = n.charAt(idx) - '0';
            String[] pat = pattern[digit];

            for (int i = 0; i < rows; i++) {
                if (i == 0) {
                    output[i].append(pat[0].charAt(1) == '-' ? " " + "-".repeat(s) + " " : " ".repeat(s+2));
                } else if (i > 0 && i <= s) {
                    output[i].append((pat[1].charAt(0) == '|' ? "|" : " ") + " ".repeat(s) + (pat[1].charAt(2) == '|' ? "|" : " "));
                } else if (i == s + 1) {
                    output[i].append(pat[2].charAt(1) == '-' ? " " + "-".repeat(s) + " " : " ".repeat(s+2));
                } else if (i > s + 1 && i < rows - 1) {
                    output[i].append((pat[3].charAt(0) == '|' ? "|" : " ") + " ".repeat(s) + (pat[3].charAt(2) == '|' ? "|" : " "));
                } else {
                    output[i].append(pat[4].charAt(1) == '-' ? " " + "-".repeat(s) + " " : " ".repeat(s+2));
                }
                if (idx < n.length() - 1) {
                    output[i].append(" ");
                }
            }
        }

        for (StringBuilder sb : output) {
            System.out.println(sb);
        }
    }
}
