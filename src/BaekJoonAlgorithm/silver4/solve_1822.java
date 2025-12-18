package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_1822 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];
        Set<Integer> bSet =new HashSet<>();
        Set<Integer> aSet =new HashSet<>();

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i =0; i<a;i++){
            arr[i] = Integer.parseInt(st2.nextToken());
            aSet.add(arr[i]);
        }
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        for(int i =0; i<b;i++){
            bSet.add(Integer.parseInt(st3.nextToken()));
        }

        for(int i =0; i<a;i++){
            if(bSet.contains(arr[i])) {
                aSet.remove(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (aSet.isEmpty()) {
            sb.append(0);
        } else {
            sb.append(aSet.size()).append("\n");
            List<Integer> list = new ArrayList<>(aSet);
            Collections.sort(list);
            for (int i : list) {
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb);
    }
}
