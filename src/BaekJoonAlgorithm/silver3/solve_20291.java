package BaekJoonAlgorithm.silver3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class solve_20291 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            String line = br.readLine();
            String[] split = line.split("\\.");
            map.put(split[1], map.getOrDefault(split[1], 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

       map.keySet().stream().sorted().forEach(key -> sb.append(key).append(" ").append(map.get(key)).append("\n"));
       System.out.println(sb);
    }
}
