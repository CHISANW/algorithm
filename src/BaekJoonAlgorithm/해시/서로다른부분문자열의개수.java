package BaekJoonAlgorithm.해시;

import java.util.*;

public class 서로다른부분문자열의개수 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<String> set = new HashSet<>();

        String line = sc.next();

        for(int i = 0;i<line.length();i++){
            for(int j =i+1;j<=line.length();j++){
                set.add(line.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
