package programmers.level_2;

public class 타겟넘버 {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(solution(numbers,target)); //result -> 5
    }

    static int count = 0;
    static boolean[] visited;
    static int tar;
    public static int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        tar = target;
        dfs(0,numbers,0);
        return count;
    }
    static void dfs(int depth,int[] numbers, int sum){
        if(depth ==numbers.length){
            if(sum == tar) count++;
        }else{
            dfs(depth+1,numbers,sum+numbers[depth]);
            dfs(depth+1,numbers,sum-numbers[depth]);
        }
    }
}
