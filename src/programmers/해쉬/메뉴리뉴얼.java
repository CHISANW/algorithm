package programmers.해쉬;

import java.util.*;

public class 메뉴리뉴얼 {
    static HashMap<Integer,HashMap<String,Integer>> maps = new HashMap<>();
    public static void main(String[] args) {
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2,3,4};
        System.out.println(Arrays.toString(solution(orders,course)));    //result -> ["AC", "ACDE", "BCFG", "CDE"]
    }

    public static String[] solution(String[] orders, int[] course) {
        for(int i : course){
            maps.put(i, new HashMap<>());
        }

        for(String order : orders){
            char[] cmd = order.toCharArray();
            Arrays.sort(cmd);
            combination(0,cmd,"");
        }

        List<String> ans = new ArrayList<>();
        for(HashMap<String,Integer> count : maps.values()){
            count.values()
                    .stream()
                    .max(Comparator.comparingInt(o -> o))
                    .ifPresent(v -> count.entrySet()
                            .stream()
                            .filter(entry-> v.equals(entry.getValue())&& v>1)
                            .forEach(e -> ans.add(e.getKey())));
        }

        Collections.sort(ans);


        return ans.toArray(new String[0]);
    }

    static void combination(int idx , char[] order, String result){
        //base case
        if(maps.containsKey(result.length())){
            HashMap<String, Integer> map = maps.get(result.length());
            map.put(result,map.getOrDefault(result,0)+1);
        }

        //recursive case
        for(int i = idx;i<order.length;i++){
            combination(i+1, order, result+order[i]);
        }
    }

}
