package BaekJoonAlgorithm.해시;

import java.io.*;
import java.util.*;

public class 생태학 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCont = 0;
        Map<String,Integer> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null && !line.isEmpty()) {
            map.put(line,map.getOrDefault(line,0)+1);
            totalCont++;
        }

        Map<String,String> answer = new LinkedHashMap<>();

        TreeMap<String, Integer> stringIntegerTreeMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : stringIntegerTreeMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            double divide = ((double)value/totalCont)*100;
            String formattedValue = String.format("%.4f", divide);
            answer.put(key,formattedValue);
        }

        for (Map.Entry<String, String> entry : answer.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
