package BaekJoonAlgorithm.정렬;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 베스트셀러 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        Map<String,Integer> map = new HashMap<>();
        for (int i =0;i<n;i++){
            String title = stdIn.next();

            map.put(title,map.getOrDefault(title,0)+1);
        }

        String maxTitle = "";
        int maxCount =0;

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int count = entry.getValue();

            if (count> maxCount || (count==maxCount && key.compareTo(maxTitle)<0)){
                maxTitle = key;
                maxCount = count;
            }
        }
        System.out.println(maxTitle);

        }
    }

