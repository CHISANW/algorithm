package programmers.트리;

import java.util.*;

public class 양과늑대 {
    static List<Integer>[] tree;
    public static void main(String[] args) {

        // 양의 위치를 나타내는 배열 (0: 없음, 1: 있음)
        int[] info = {0,0,1,1,1,0,1,0,1,0,1,1};         // 리스트
        int[][] edges = {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};
        System.out.println(solution(info,edges));       //result = 5

        // 양의 위치를 나타내는 배열 (0: 없음, 1: 있음)
        int[] info1 = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0};
        int[][] edges1 = {{0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 5}, {2, 6}, {3, 7}, {4, 8}, {6, 9}, {9, 10}};
        System.out.println(solution(info1,edges1));       //result = 5

    }
    public static int solution(int[] info, int[][] edges) {
        //트리 생성
        buildList(info,edges);

        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0,1,0,new HashSet<>()));

        
        //BFS 시작
        int answer  = 0; // 한번 탐색을 마다 양의 최댓값을 구함

        while(!q.isEmpty()){
            Point now = q.poll();
            answer = Math.max(answer, now.sheep); // 양의 최댓값을 

            now.visited.addAll(tree[now.node]); //현재 큐에서 뽑은 node의 기준으로 tree에서 연결된 방문된 값을 복사해서 넣는다.

            for(int next :now.visited){     //현재 복사된 방문 Set(연결된 리시트)를 반복
                HashSet<Integer> set = new HashSet<>(now.visited);
                set.remove(next);
                
                if(info[next]==1){            //만약 다음 리스트가 늑대 노드일떄
                    if(now.sheep != now.wolf+1){        // 현재 뽑은 양이 다음번 탐색의 늑대랑 일치하지않는다, 즉 => 현재 모인 양보다 늑대가 작다는뜻 
                        q.add(new Point(next,now.sheep,now.wolf+1 ,set));       // 늑대의 +1 을 증가해서 다음 탐색 진입
                    }
                }else{                      // 다음 리스트가 양일때는 계속탐색
                    q.add(new Point(next,now.sheep+1,now.wolf,set));
                }
            }
        }
        return answer;
    }
    static void buildList(int[] iofo,  int[][] edges){
        // 트리 배열 생성
        tree = new ArrayList[iofo.length];

        // 트리배열의 리스트 초기화
        for(int i =0;i<iofo.length;i++){
            tree[i] = new ArrayList<>();
        }

        //인접 리스트 트리 만들기
        for(int[] edge : edges){
         tree[edge[0]].add(edge[1]);
        }
    }

    
    //클래스 생성
    static class Point{
        int node, sheep,wolf;
        HashSet<Integer> visited;

        public Point(int node, int sheep, int wolf, HashSet<Integer> set){
            this.node = node;
            this.sheep = sheep;
            this.wolf = wolf;
            this.visited = set;
        }
    }
}
