package programmers.완전탐색;

public class 피로도 {
    public static void main(String[] args) {

        int k = 80;
        int[][] dungeons ={{80,20},{50,40},{30,10}};

        System.out.println(solution(k,dungeons));       //result -> 3
    }

    static int[][] dungeon;
    static boolean[] visited;
    static int max = Integer.MIN_VALUE;
    static int solution(int k, int[][] dungeons) {

        dungeon = dungeons;
        visited = new boolean[dungeons.length];

        dfs(k,0);

        return max;
    }

    static void dfs(int hp, int count){
        for(int i = 0;i<dungeon.length;i++){
            if(!visited[i] && hp >= dungeon[i][0]){
                visited[i] =true;
                dfs(hp-dungeon[i][1],count+1);
                max = Math.max(max, count+1);
                visited[i] =false;
            }
        }
    }
}
