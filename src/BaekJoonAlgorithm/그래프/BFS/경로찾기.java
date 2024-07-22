package BaekJoonAlgorithm.그래프.BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 경로찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int[][] graph = new int[num][num];
        int[][] result = new int[num][num];

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        Queue<Integer> queue;
        boolean[] visited;

        for(int i = 0; i <num; i++) {
            queue = new LinkedList<>();
            visited = new boolean[num];
            queue.offer(i);
            int tmp;
            while(!queue.isEmpty()) {
                tmp = queue.poll();
                for(int j = 0; j < num; j++) {
                    if(graph[tmp][j] == 1 && visited[j] != true) {
                        visited[j] = true;
                        queue.offer(j);
                        result[i][j] = 1;
                    }
                }
            }
        }

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num ; j++)
                System.out.print(result[i][j]+" ");
            System.out.println();
        }
    }
}
