package programmers.Re_Level_2;

import java.util.*;

public class 튜플 {
    public static void main(String[] args) {
        String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
        System.out.println(Arrays.toString(solution(s)));
    }

    static int[] solution(String s) {
        String replace = s.substring(0, s.length() - 2).replace("{", "");
        String[] split = replace.split("},");

        Arrays.sort(split, (o1, o2) -> Integer.compare(o1.length(), o2.length()));
        Set<Integer> answer = new LinkedHashSet<>();

        for (String str : split) {
            String[] numbers = str.split(",");
            for (String number : numbers) {
                answer.add(Integer.parseInt(number.trim()));
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
