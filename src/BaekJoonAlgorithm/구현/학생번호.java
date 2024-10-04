package BaekJoonAlgorithm.구현;

import java.util.*;

public class 학생번호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];

        for (int i =0; i<n;i++){
            StringBuilder sb = new StringBuilder();
            arr[i]= sb.append(sc.next()).reverse().toString();
        }

        for (int i =0; i<arr[0].length();i++){
            Set<String> set = new HashSet<>();
            int length = 0;

            for (String srt : arr){
                String substring = srt.substring(0, i+1);
                length = substring.length();
                set.add(substring);
            }
            if (set.size()==n){
                System.out.println(length);
                return;
            }

        }
    }
}
