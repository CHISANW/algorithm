package BaekJoonAlgorithm.테스트;

import java.util.*;

public class 입국심사 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();        // 입국 심사대
        int M = stdIn.nextInt();        // 학생수

        int[] arr =new int[N];
        for (int i =0;i<N;i++) {
            arr[i] = stdIn.nextInt();       // 입국심사대 걸리는 시간을 초기화
        }

        //이진 탐색을 통해 문제풀이
        long l =1;                         // 왼쪽
        long r= (long)Arrays.stream(arr).min().getAsInt()* M;    // 오른쪽 인덱스값은 최소 시간을 구하는거기때문에 입국심사대 배열에서 최소 시간의 값과 사람의 수를 곱하면 한 심사대에서 걸리는 최소 시간을 찾을수있다.
        long ans = 0;

        while (l<=r) {
            long m = (l + r) / 2;
            if (isCheckTime(arr, m) >= M) {             //ex) 만약 2개의 심사칸에서  7,8시간이 걸리고 6명이였을때 28초가 된이유는 28초를 7초에 포함된 사람은 4명이며, 10초에 포함된 사람이 2명이어서 4+2명은 6명이므로 해당값이 답이된다.
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        System.out.println(ans);
    }

     static long isCheckTime(int[] arr, long m) {
        long count = 0;
        for(int time : arr){
            count += m/time;
        }
        return count;
    }
}
