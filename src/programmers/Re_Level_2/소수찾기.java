package programmers.Re_Level_2;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {
    static Set<Integer> combi;
    public static void main(String[] args) {
        System.out.println(solution("17"));
        System.out.println(solution("011"));
    }

    static int solution(String numbers) {
        combi = new HashSet<>();
        int answer = 0;

        boolean[] visited = new boolean[numbers.length()];
        dfs(numbers,"",visited);

        for(int num : combi){
            if(isPrime(num)) answer++;
        }

        return answer;
    }

    static void dfs(String numbers, String current, boolean[] visited){

        if(!current.equals("")){
            combi.add(Integer.parseInt(current));
        }

        for(int i =0;i<numbers.length();i++){
            if(visited[i]) continue;

            visited[i] = true;
            dfs(numbers, current + numbers.charAt(i), visited);
            visited[i] = false;
        }
    }

    static boolean isPrime(int num){

        if(num < 2) return false;

        for(int i=2;i*i<=num;i++){
            if(num % i == 0) return false;
        }

        return true;
    }
}
