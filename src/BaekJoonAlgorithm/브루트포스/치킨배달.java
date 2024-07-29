package BaekJoonAlgorithm.브루트포스;

import java.util.*;

public class 치킨배달 {
    static int[][] board;
    static int n, m;
    static List<int[]> houses;
    static List<int[]> chicken;
    static int minCityChickenDistance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        board = new int[n][n];
        houses = new ArrayList<>();
        chicken = new ArrayList<>();

        for(int i =0; i<n;i++){
            for(int j= 0;j<n;j++){
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1){
                    houses.add(new int[]{i,j});
                }else if(board[i][j] == 2){
                    chicken.add(new int[]{i,j});
                }
            }
        }

        boolean[] visited = new boolean[chicken.size()];
        combination(visited, 0, chicken.size(),m);
        System.out.println(minCityChickenDistance);

    }

    static void combination(boolean[] visited , int start, int n, int r){
        if(r == 0){
            calculateCity(visited);
            return;
        }

        for(int i =start;i<n;i++){
            visited[i] = true;
            combination(visited, i+1,n,r-1);
            visited[i]= false;
        }
    }

    static void calculateCity(boolean[] visited){
        List<int[]> selectedChickens = new ArrayList<>();
        for(int i =0; i<visited.length;i++){
            if (visited[i]){
                selectedChickens.add(chicken.get(i));
            }
        }

        int cityChicken = 0;
        for(int[] house : houses){
            int houseDistance = Integer.MAX_VALUE;
            for(int[] ch : selectedChickens){
                int distance = Math.abs(house[0] - ch[0]) + Math.abs(house[1] - ch[1]);
                houseDistance = Math.min(houseDistance,distance);
            }
            cityChicken += houseDistance;
        }
        minCityChickenDistance = Math.min(minCityChickenDistance,cityChicken);
    }
}
