package programmers.Re_Level_2;

public class 피로도 {
    static int answer = 0;
    static int[][] dun;
    public static void main(String[] args) {

        System.out.println(solution(80,new int[][]{{80,20},{50,40},{30,10}}));
    }

    static int solution(int k, int[][] dungeons) {
        dun = dungeons;
        boolean[] visited = new boolean[dun.length];
        dfs(k,0,visited);
        return answer;
    }

    static void dfs(int k, int count ,boolean[] visited){
        answer = Math.max(answer,count);

        for(int i =0; i<dun.length;i++){
            if(!visited[i] && k >= dun[i][0]){
                visited[i] = true;
                dfs(k-dun[i][1],count+1,visited);
                visited[i] = false;
            }
        }

    }
}
