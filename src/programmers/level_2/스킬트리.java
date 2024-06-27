package programmers.level_2;

import java.util.*;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_tress = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill,skill_tress));        //result -> 2
    }

    public static int solution(String skill, String[] skill_trees) {

        Map<Character, Integer>  map = new HashMap<>();

        for(int i =0; i<skill.length();i++){
            map.put(skill.charAt(i),i);
        }
        int count =0;

        for(int i =0;i<skill_trees.length;i++){
            Deque<Character> dq = new LinkedList<>();
            int index = 0;
            boolean check = false;
            for(char c : skill_trees[i].toCharArray()){
                dq.addLast(c);
            }

            while(!dq.isEmpty()){
                char sk = dq.pollFirst();
                if(map.containsKey(sk)){
                    int value = map.get(sk);
                    if(value == index) {
                        index++;
                        check = true;
                    }else{
                        check = false;
                        break;
                    }

                }else{
                    check =true;
                }
            }
            if(check && index >0) count++;
            if(check && index==0) count++;
        }

        return count;
    }


    public int After_solution(String skill, String[] skill_trees) {
        Map<Character, Integer> skillOrder = new HashMap<>();

        for (int i = 0; i < skill.length(); i++) {
            skillOrder.put(skill.charAt(i), i);
        }

        int count = 0;

        for (String skillTree : skill_trees) {
            int currentIndex = 0;
            boolean isValid = true;

            for (char c : skillTree.toCharArray()) {
                if (skillOrder.containsKey(c)) {
                    int requiredIndex = skillOrder.get(c);
                    if (requiredIndex == currentIndex) {
                        currentIndex++;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }

            if (isValid) {
                count++;
            }
        }

        return count;
    }
}
