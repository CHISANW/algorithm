package BaekJoonAlgorithm.그리디;

import java.io.*;
import java.util.*;

public class 우리집엔도서관이있어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int book  = Integer.parseInt(br.readLine());
        List<Integer> list= new ArrayList<>();

        int answer = 0;

        for (int i =0; i<book;i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.reverse(list);

        int target = book;
        for (Integer i : list) {
            if (i==target){
                target--;
            }else{
                answer++;
            }
        }

        System.out.println(answer);
    }
}
