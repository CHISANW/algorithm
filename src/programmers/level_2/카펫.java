package programmers.level_2;

public class 카펫 {
    public static void main(String[] args) {

        System.out.println(solution(10,2)); // result -> [4, 3]

        System.out.println(solution(8,1));  // result -> [3, 3]

        System.out.println(solution(24,24));    // result -> [8, 6]
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown+yellow;

        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                int j = sum / i;
                if (i >= j) {
                    if ((i - 2) * (j - 2) == yellow) {
                        answer[0] = i;
                        answer[1] = j;
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
