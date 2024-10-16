package BaekJoonAlgorithm.해시;

import java.io.*;
import java.util.*;

public class 가희와키워드 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();

        String line = br.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        for (int i =0; i<n;i++){
            set.add(br.readLine());
        }

        for (int i =0; i<m;i++){
            String keyword = br.readLine();
            String[] keywords = keyword.split(",");
            for (String word : keywords) {
                if (set.contains(word)){;
                    set.remove(word);
                }
            }
            sb.append(set.size()).append("\n");
        }
        System.out.println(sb);
    }
}
