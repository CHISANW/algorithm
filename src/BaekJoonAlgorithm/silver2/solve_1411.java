package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class solve_1411 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] words = new String[N];
        String[] patterns = new String[N];

        for(int i =0; i<N;i++){
            words[i] = br.readLine();
            patterns[i] = normalize(words[i]);
        }

        int count = 0 ;
        for(int i =0; i<N;i++){
            for(int j = i+1; j<N;j++){
                if(patterns[i].equals(patterns[j])){
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static String normalize(String s){
        Map<Character, Integer> map  = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, idx++);
            }
            sb.append(map.get(c)).append(',');
        }

        return sb.toString();
    }
}
