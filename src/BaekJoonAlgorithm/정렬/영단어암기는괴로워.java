package BaekJoonAlgorithm.정렬;

import java.util.*;
import java.io.*;

public class 영단어암기는괴로워 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

       Map<String,Integer> map = new HashMap<>();

       for(int i =0; i<n;i++){
           String line = br.readLine();
           if (line.length()>=m){
               map.put(line,map.getOrDefault(line, 0) + 1);
           }
       }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(map.entrySet());
        sortedList.sort((entry1, entry2) -> {

            int frequencyComparison = Integer.compare(entry2.getValue(), entry1.getValue());
            if (frequencyComparison != 0) {
                return frequencyComparison;
            }

            int lengthComparison = Integer.compare(entry2.getKey().length(), entry1.getKey().length());
            if (lengthComparison != 0) {
                return lengthComparison;
            }

            return entry1.getKey().compareTo(entry2.getKey());
        });

       StringBuilder sb = new StringBuilder();
       for(Map.Entry<String,Integer> maps: sortedList){
           sb.append(maps.getKey()).append("\n");
       }
        System.out.println(sb);
    }

}
