package programmers.Lever_1;

import java.util.*;

public class 대충만든자판 {
    public static void main(String[] args) {

        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        System.out.println(Arrays.toString(solution(keymap,targets)));
    }

    public static int[] solution(String[] keymap, String[] targets) {

        int[] answer = new int[targets.length];

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            char[] key = keymap[i].toCharArray();
            for (int j = 0; j < key.length; j++) {
                if (!map.containsKey(key[j])) {
                    map.put(key[j], j + 1);
                } else {
                    int value = map.get(key[j]);
                    map.put(key[j], Math.min(value, j + 1));
                }
            }
        }
        for (int i = 0; i < targets.length; i++) {
            char[] cmd = targets[i].toCharArray();
            int sum = 0;
            boolean check = true;
            for (int j = 0; j < cmd.length; j++) {
                if (map.containsKey(cmd[j])) {
                    sum += map.get(cmd[j]);
                } else {
                    check = false;
                    break;
                }
            }
            answer[i] = check == true ? sum : -1;
        }
        return answer;
    }
}
