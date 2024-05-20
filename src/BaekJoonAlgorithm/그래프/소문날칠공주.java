package BaekJoonAlgorithm.그래프;

import java.util.*;

public class 소문날칠공주 {
    static int[] students = new int[25];
    static boolean[] check = new boolean[25];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            String str = sc.next();
            for (int j = 0; j < 5; j++) {
                if (str.charAt(j) == 'S') {
                    students[cnt] = 1;
                }
                else {
                    students[cnt] = 0;
                }
                cnt++;
            }
        }

        int combination = nextCombination(0);
        System.out.println(combination);
    }

    public static boolean isFriend(int a, int b) {
        int diff = Math.abs(a - b);
        int max = Math.max(a, b);

        if (diff == 1 && max % 5 != 0) return true;
        if (diff == 5) return true;

        return false;
    }

    static List<Integer> pick = new ArrayList<>();

    static int nextCombination(int studentNum){
        //현재 배열의 꽉찼다면
        //base case
        if (pick.size() == 7) {
            int cnt = 0;
            // 이다솜파 인원 체크
            for (int i = 0; i < 7; i++) {
                if (students[pick.get(i)] == 1) cnt++;
            }
            // 이다솜파가 4명 미만이라면 조합으로 사용하지 않음
            if (cnt < 4) return 0;

            // DFS 탐색 전 초기화
            for (int i = 0; i < 7; i++) {
                check[i] = false;
            }
            // 7명이 모두 인접해있다면 조합으로 인정함
            if (dfs(0) == 7) return 1;
            return 0;
        }

        //모든 배열을 순회했는데 이다솜파가 없을 경우는 0
        if(studentNum >= 25) return 0;

        int ret = 0; // 조합의 개수
        // studentNum 번째 학생을 포함하지 않는 경우
        ret += nextCombination(studentNum + 1);
        // studentNum 번째 학생을 포함하는 경우
        pick.add(studentNum);
        ret += nextCombination(studentNum + 1);
        pick.remove(pick.size() - 1);
        return ret;
    }

    static int dfs(int studentNum) {
        int count = 1;
        check[studentNum] = true;
        for (int i = 1; i < 7; i++) {
            int me = pick.get(studentNum);
            int you = pick.get(i);
            if (!check[i] && isFriend(me, you)) {
                count += dfs(i);
            }
        }
        return count;
    }


}
