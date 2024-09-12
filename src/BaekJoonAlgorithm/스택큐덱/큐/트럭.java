package BaekJoonAlgorithm.스택큐덱.큐;

import java.util.*;

public class 트럭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();   // 트럭수
        int w = sc.nextInt();   // 다리 길이
        int l = sc.nextInt();   // 최대 하중

        int[] arr = new int[n];

        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Queue<Integer> q = new LinkedList<>();
        int bridge = 0;
        int time = 0;
        int index =0;
        for (int i =0; i<w;i++){
            q.add(0);
        }

        while (!q.isEmpty()){
            time++;
            bridge -= q.poll();

            if (index < n && bridge + arr[index]<=l){
                q.add(arr[index]);
                bridge += arr[index];
                index++;
            }else{
                q.add(0);
            }

            if (index >= n && bridge == 0) {
                break;
            }
        }

        System.out.println(time);

    }
}
