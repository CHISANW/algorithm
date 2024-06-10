package programmers.Lever_1;

import java.util.*;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo ={{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"},{"kon", "kain", "may", "coni"}};     //result - > [19, 15, 6]

        System.out.println(Arrays.toString(solution(name,yearning,photo)));
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] ans = new int[photo.length];
        Map<String,Integer> map = new LinkedHashMap<>();

        for(int i =0;i<name.length;i++){
            map.put(name[i], map.getOrDefault(map.get(name[i]),0)+yearning[i]);
        }



        for(int i = 0; i<photo.length;i++){
            int count = 0 ;
            for(int j = 0; j<photo[i].length;j++){
                if(map.containsKey(photo[i][j])){
                    count += map.get(photo[i][j]);
                }
            }
            ans[i] = count;
        }

        return ans;
    }

}
