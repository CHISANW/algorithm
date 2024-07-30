package BaekJoonAlgorithm.유니온파인드;

import java.io.*;
import java.util.*;

public class 거짓말 {
    static int[] parent;
    static List<Integer> people;
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st= new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        parent = new int[n+1];

        for(int i =1; i<=n;i++){
            parent[i] = i;
        }
        people = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        int en = Integer.parseInt(st.nextToken());

        if(en == 0){
            System.out.println(m);
            return;
        }else {
            for(int i =0; i<en;i++){
               people.add(Integer.parseInt(st.nextToken()));
            }
        }

        List<Integer>[] graph = new ArrayList[m];

        for(int i =0; i<m;i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int peopleCount = Integer.parseInt(st.nextToken());

            int firstPeople = Integer.parseInt(st.nextToken());
            graph[i].add(firstPeople);
            for(int j =1; j<peopleCount;j++){
                int nextPeople = Integer.parseInt(st.nextToken());
                union(firstPeople,nextPeople);
                graph[i].add(nextPeople);
            }
        }

        int ans = 0;
        for(int i =0;i<m;i++){
            boolean check = true;

            for(int num : graph[i]){
                if(people.contains(find(parent[num]))){
                    check=false;
                    break;
                }
            }

            if (check){
                ans++;
            }
        }
        System.out.println(ans);
    }

    static int find(int x){
        if(parent[x] == x) return x;
        return find(parent[x]);
    }

    static void union(int x ,int y){
        int findX = find(x);
        int findY = find(y);

        if(people.contains(findY)){
            int temp = findX;
            findX = findY;
            findY = temp;
        }
        parent[findY] = findX;
    }
}
