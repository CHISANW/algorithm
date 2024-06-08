package programmers.level_2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));       //result -> [2, 1, 3, 4]

        String s1 = "{{4,2,3},{3},{2,3,4,1},{2,3}}";
        System.out.println(Arrays.toString(solution(s1)));       //result -> [3, 2, 4, 1]

    }

    static int[] solution(String s) {

        String replace = s.substring(0, s.length() - 2).replace("{", "");
        String[] split = replace.split("},");


        Arrays.sort(split, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

        Set<Integer> set = new LinkedHashSet<>();
        for (String string : split) {
            String[] strings = string.split(",");
            for (String sv : strings) {
                set.add(Integer.parseInt(sv));
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
