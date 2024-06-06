package programmers.Lever_1;

import java.util.*;

public class 문자열내맘대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
        System.out.println(Arrays.toString(solution(strings,n)));

        String[] strings1 = {"abce", "abcd", "cdx"};
        int n1 = 1;
        System.out.println(Arrays.toString(solution(strings1, n1)));  // ["abcd", "abce", "cdx"]
    }

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) {
                return o1.compareTo(o2);  // n번째 문자가 같으면 전체 문자열로 비교
            } else {
                return Character.compare(o1.charAt(n), o2.charAt(n));  // n번째 문자로 비교
            }
        });

        return strings;
    }

}
