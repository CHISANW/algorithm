package programmers.그리디;

public class 네트워크 {
    public static void main(String[] args) {

        int n = 3;
        int[][] computers  = {{1, 1, 0}, {1, 1, 0},{0, 0, 1}};
        System.out.println(solution(n,computers));

//        int n1 = 1;
//        int[][] computers1  = {{1, 1, 0}, {1, 1, 1},{0, 1, 1}};
//        System.out.println(solution(n1,computers1));
    }

    static int[][] computer;
    static boolean[] visited;
    static int solution(int n, int[][] computers) {
        int ans = 0;

        computer = computers;
        visited = new boolean[n];

        for(int i =0 ;i<n;i++){
            if(!visited[i]){
                dfs(i);
                ans++;
            }
        }
        return ans;
    }

    private static void dfs(int node){
        visited[node] = true;

        for(int i =0; i<computer[node].length;i++){
            if(!visited[i] && computer[node][i]==1){
                dfs(i);
            }
        }
    }
}
