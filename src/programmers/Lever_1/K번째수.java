package programmers.Lever_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public static void main(String[] args) {

        int[] array ={1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array,commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        int index = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int find = command[2];

            List<Integer> list = new ArrayList<>();
            for (int i = start - 1; i < end; i++) {
                list.add(array[i]);
            }

            Collections.sort(list);

            answer[index++] = list.get(find - 1);
        }
        return answer;
    }
}
