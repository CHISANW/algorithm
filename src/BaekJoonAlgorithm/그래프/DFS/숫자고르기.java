package BaekJoonAlgorithm.그래프.DFS;

import java.util.*;

public class 숫자고르기 {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static boolean[] finished;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n+1];
        visited = new boolean[n+1];
        finished = new boolean[n+1];

        for (int i =1; i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for (int i =1; i<=n;i++){
            if (!visited[i]){
                dfs(i);
            }
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (Integer i : list) {
            System.out.println(i);
        }

    }

    static void dfs(int value){
        visited[value] = true;
        int next = arr[value];

        if (!visited[next]){
            dfs(next);
        }else if (!finished[next]){
            for (int i = next; i != value; i= arr[i]){
                list.add(i);
            }
            list.add(value);
        }

        finished[value] = true;
    }
}
