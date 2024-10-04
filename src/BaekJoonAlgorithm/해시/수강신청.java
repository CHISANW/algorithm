package BaekJoonAlgorithm.해시;

import java.util.*;

public class 수강신청 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();

        Set<String> set = new LinkedHashSet<>();

        for (int i =0; i<l;i++){
            String std = sc.next();
            if (set.contains(std)){
                set.remove(std);
            }
            set.add(std);
        }


        int count = 0;
        for (String str : set) {
            count++;
            System.out.println(str);
            if (count==k){
                break;
            }
        }

    }
}
