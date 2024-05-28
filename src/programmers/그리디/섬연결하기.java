package programmers.그리디;

import java.util.*;

public class 섬연결하기 {
    static int[] parent;
    public static void main(String[] args) {
        int n = 4;
        int[][] costs = {{0,1,1},{0,2,2},{1,3,1},{2,3,8}};
        System.out.println(solution(n,costs));      //result -> 4

    }

    static int find(int x){
        if(x == parent[x])
            return x;

        return  parent[x] = find(parent[x]);
    }

    static void union(int x, int y){
        int root1 = find(x);
        int root2 = find(y);

        parent[root2] = root1;
    }

    static int solution(int n , int[][] costs){

        Arrays.sort(costs, (o1,o2) -> Integer.compare(o1[2],o2[2]));



        parent = new int[n];

        for(int i = 0;i<n;i++){
            parent[i] = i;
        }

        int bride =0;
        int answer = 0;
        for(int[] cost : costs) {

            if (bride == n - 1)
                break;

            if (find(cost[0]) != find(cost[1])) {
                union(cost[0], cost[1]);
                answer += cost[2];
                bride++;
            }
        }

        return answer;
    }
}
