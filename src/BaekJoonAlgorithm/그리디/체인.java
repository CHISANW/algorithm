package BaekJoonAlgorithm.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 체인 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        int cnt = 0;
        for (int i =0; i<n;i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        while (true){
            if (list.size()<=1)
                break;

            list.set(0,list.get(0)-1);
            list.remove(list.size()-1);
            if (list.get(0)==0){
                list.remove(0);
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
