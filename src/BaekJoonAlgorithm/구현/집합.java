package BaekJoonAlgorithm.구현;

import java.io.*;
import java.util.*;

public class 집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < m; i++) {
            String s = br.readLine();

            if (s.equals("all")) {
                set.clear();
                for(int v = 1; v <= 20; v++) {
                    set.add(v);
                }
            } else if (s.equals("empty")) {
                set.clear();
            } else {
                String[] split = s.split(" ");
                String type = split[0];
                int value = Integer.parseInt(split[1]);

                switch (type) {
                    case "add":
                        set.add(value);
                        break;
                    case "check":
                        if (set.contains(value)) {
                            bw.write("1\n");
                        } else {
                            bw.write("0\n");
                        }
                        break;
                    case "remove":
                        set.remove(value);
                        break;
                    case "toggle":
                        if (set.contains(value)) {
                            set.remove(value);
                        } else {
                            set.add(value);
                        }
                        break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}