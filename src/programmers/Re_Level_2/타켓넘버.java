package programmers.Re_Level_2;

public class 타켓넘버 {
    static int answer;
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,1,1,1},3));
        System.out.println(solution(new int[]{4, 1, 2, 1},4));
    }

    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers,target,0,0);
        return answer;
    }

    static void dfs(int[] numbers, int target,int sum, int depth){
        if(depth == numbers.length){
            if(target == sum){
                answer++;
            }
            return;
        }
        dfs(numbers,target,sum+numbers[depth],depth+1);
        dfs(numbers,target,sum-numbers[depth],depth+1);
    }
}
