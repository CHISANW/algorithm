package BaekJoonAlgorithm.silver5;

import java.util.*;

public class solve_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<String>();

        for(int i =0; i<n;i++){
            set.add(sc.next());
        }

       List<String> list = new ArrayList<>(set);

        list.sort((a,b) -> {
            if(a.length() == b.length()){
                return a.compareTo(b);
            }
            return a.length() - b.length();
        });

        for (String s : list) {
            System.out.println(s);
        }
    }
}
