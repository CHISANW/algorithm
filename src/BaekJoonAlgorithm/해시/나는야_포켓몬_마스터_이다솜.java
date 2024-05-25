package BaekJoonAlgorithm.해시;

import java.util.*;

public class 나는야_포켓몬_마스터_이다솜 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String ,Integer> pkeMon_a = new HashMap<>();
        Map<String,String> pkeMon_b = new HashMap<>();
        for(int i =1;i<=n;i++){
            String poke = sc.next();
            pkeMon_a.put(poke,i);
            pkeMon_b.put(String.valueOf(i),poke);
        }

        for(int i =0;i<m;i++){
            String key = sc.next();
            if(pkeMon_a.containsKey(key)){
                System.out.println(pkeMon_a.get(key));
            }else{
                System.out.println(pkeMon_b.get(key));
            }
        }
    }
}
