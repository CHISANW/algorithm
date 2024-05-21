package programmers.스택_큐_덱;

import java.util.*;

public class 카드뭉치 {
    public static void main(String[] args) {

        String[] cards1_ans1 = {"i", "drink", "water"};
        String[] cards2_ans1 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1_ans1,cards2_ans1,goal));     //result => "Yes"

        String[] cards1_ans2 = {"i", "water", "drink"};
        String[] cards2_ans2 = {"want", "to"};
        String[] goal1 = {"i", "want", "to", "drink", "water"};

        System.out.println(solution(cards1_ans2,cards2_ans2,goal1));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        Deque<String> card1 =new ArrayDeque<>(Arrays.asList(cards1));
        Deque<String> card2 =new ArrayDeque<>(Arrays.asList(cards2));
        Deque<String> goals =new ArrayDeque<>(Arrays.asList(goal));

        while (!goals.isEmpty()) {
            if (!card1.isEmpty() && card1.peekFirst().equals(goals.peekFirst())) {
                card1.pollFirst();
                goals.pollFirst();
            }
            else if (!card2.isEmpty() && card2.peekFirst().equals(goals.peekFirst())) {
                card2.pollFirst();
                goals.pollFirst();
            }
            else
                break;

        }
        return goals.isEmpty() ? "Yes" : "No";
    }

}
