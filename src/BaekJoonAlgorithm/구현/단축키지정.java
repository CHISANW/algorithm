package BaekJoonAlgorithm.구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 단축키지정 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<Character> used = new HashSet<>();
        List<String> result = new ArrayList<>();

        for (int i =0; i<n; i++){
            String input = br.readLine();
            String[] words = input.split(" ");
            boolean check = false;

            for (int j = 0; j < words.length; j++) {
                if (!used.contains(Character.toLowerCase(words[j].charAt(0)))) {
                    used.add(Character.toLowerCase(words[j].charAt(0)));
                    words[j] = "[" + words[j].charAt(0) + "]" + words[j].substring(1);
                    check = true;
                    break;
                }
            }

            if (!check) {
                boolean bb = false;
                for (int j = 0; j < words.length; j++) {
                    if (bb) break;
                    for (int k = 1; k < words[j].length(); k++) {
                        if (!used.contains(Character.toLowerCase(words[j].charAt(k)))) {
                            used.add(Character.toLowerCase(words[j].charAt(k)));
                            words[j] = words[j].substring(0, k) + "[" + words[j].charAt(k) + "]" + words[j].substring(k + 1);
                            bb= true;
                            break;
                        }
                    }
                }
            }

            result.add(String.join(" ", words));
        }

        for (String line : result) {
            System.out.println(line);
        }
    }
}
