package programmers.level_2;

import java.util.*;

public class 압축 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("KAKAO")));      // result -> [11, 1, 27, 15]

        System.out.println(Arrays.toString(solution("TOBEORNOTTOBEORTOBEORNOT"))); //result ->  [20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34]
    }

    public static int[] solution(String msg) {
        // 초기 사전 세팅
        Map<String, Integer> map = new HashMap<>();
        int start = 65; // ASCII 값 A
        for (int i = 0; i < 26; i++) {
            String alpha = String.valueOf((char) start++);
            map.put(alpha, i + 1);
        }

        List<Integer> output = new ArrayList<>();
        int index = 27;
        int i = 0;

        while (i < msg.length()) {
            StringBuilder current = new StringBuilder();
            current.append(msg.charAt(i));
            int j = i + 1;

            while (j < msg.length() && map.containsKey(current.toString() + msg.charAt(j))) {
                current.append(msg.charAt(j));
                j++;
            }

            output.add(map.get(current.toString()));

            if (j < msg.length()) {
                map.put(current.toString() + msg.charAt(j), index++);
            }

            i = j;  // i를 현재 문자열의 끝으로 이동
        }

        int[] answer = new int[output.size()];
        for (int k = 0; k < output.size(); k++) {
            answer[k] = output.get(k);
        }

        return answer;
    }
}
