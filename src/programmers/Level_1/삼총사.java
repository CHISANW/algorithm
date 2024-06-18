package programmers.Level_1;

public class 삼총사 {
    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number)); // 기대값: 2

        int[] number1 = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number1)); // 기대값: 2
    }

    static int max;
    static boolean[] check;
    public static int solution(int[] number) {
        max = 0; // max를 초기화합니다.

        check= new boolean[number.length];
        dfs(number, 0, 0, 0);

        return max;
    }

    static void dfs(int[] number, int now, int count, int sum) {
        if (count == 3) {
            if (sum == 0) {
                max++;
            }
            return;
        }

        for (int i = now; i < number.length; i++) {
            dfs(number, i + 1, count + 1, sum + number[i]);
        }
    }
}
