package BaekJoonAlgorithm.수학;

import java.io.*;
import java.util.*;

public class 통계학 {
    public static void main(String[] args) throws Exception{
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i = 0; i<n;i++) {
            int c = Integer.parseInt(br.readLine());
            arr[i] = c;
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        Arrays.sort(arr);

        int sum =0;
        for(int i : arr){
            sum += i;
        }


        int avg = Math.round((float) sum / (float)n);

        int maxFrequency = Collections.max(frequencyMap.values());
        List<Integer> modeCandidates = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                modeCandidates.add(entry.getKey());
            }
        }
        Collections.sort(modeCandidates);

        int frequency = modeCandidates.size() > 1 ? modeCandidates.get(1) : modeCandidates.get(0);

        System.out.println(avg);
        System.out.println(arr[n/2]);
        System.out.println(frequency);
        System.out.println(arr[n-1]-arr[0]);

    }
}
