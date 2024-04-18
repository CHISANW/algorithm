package BaekJoonAlgorithm.정렬;

import java.io.*;
import java.util.*;

public class 좌표압축 {
    public static void main(String[] args) throws IOException {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        Set<Integer> set = new TreeSet<>();
        int[] xs = new int[n];

        for (int i =0;i<n;i++){
            xs[i]=stdIn.nextInt();
            set.add(xs[i]);
        }

        Map<Integer,Integer> map = new HashMap<>();
        int idx = 0;

        for (int x : set){
            map.put(x,idx++);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i =0;i<n;i++){
            bw.write(map.get(xs[i])+" ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
