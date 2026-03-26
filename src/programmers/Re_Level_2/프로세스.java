package programmers.Re_Level_2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class 프로세스 {
    public static void main(String[] args) {

    }

    public static int solution(int[] priorities, int location) {
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        for (int priority : priorities) {
            set.add(priority);
        }



        int answer = 0;
        return answer;
    }
}
