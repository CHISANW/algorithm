package BaekJoonAlgorithm.silver2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class solve_5464 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] parkPee = new int[n+1];
        for(int i =1; i<=n;i++){
            parkPee[i] = Integer.parseInt(br.readLine());
        }

        int[] carWeight = new int[m+1];
        for(int i =1; i<=m;i++){
            carWeight[i] = Integer.parseInt(br.readLine());
        }


        int[] order = new int[m*2];

        for(int i =0; i<m*2;i++){
            order[i] = Integer.parseInt(br.readLine());
        }

        PriorityQueue<Integer> freeSpaces = new PriorityQueue<>();
        for(int i =1; i<=n;i++){
            freeSpaces.offer(i);
        }

        Queue<Integer> waitingCars = new LinkedList<>();

        int[] parkAt = new int[m+1];

        long total = 0;

        for(int o : order){
            //입차
            if(o > 0){
                if(!freeSpaces.isEmpty()){
                    Integer space = freeSpaces.poll();
                    parkAt[o] = space;
                }else{
                    waitingCars.offer(o);
                }
            }else{
                int carNum = -o;
                int space = parkAt[carNum];

                total += (long) carWeight[carNum] * parkPee[space];

                if(!waitingCars.isEmpty()){
                    int nextCar = waitingCars.poll();
                    parkAt[nextCar] = space;
                }else{
                    freeSpaces.offer(space);
                }
            }
        }
        System.out.println(total);
    }
}
