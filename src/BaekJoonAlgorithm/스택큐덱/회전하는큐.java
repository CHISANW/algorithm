package BaekJoonAlgorithm.스택큐덱;

import java.util.*;

public class 회전하는큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

       LinkedList<Integer> dq = new LinkedList<>();
        int[] arr = new int[m];

        for(int i =1;i<=n;i++){
            dq.addLast(i);
        }
        for(int i =0; i<m;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0;i<m;i++){

            int targetIndex = dq.indexOf(arr[i]);
            int half_idx;

            if (dq.size() %2 == 0){
                half_idx = dq.size() /2 -1;
            }else
                half_idx = dq.size()/ 2;

            if (targetIndex <= half_idx){
                for (int j =0;j<targetIndex;j++){
                    int first = dq.pollFirst();
                    dq.addLast(first);
                    count++;
                }
            }else{
                for (int j =0;j<dq.size() - targetIndex;j++){
                    int last = dq.pollLast();
                    dq.addFirst(last);
                    count++;
                }
            }

            dq.pollFirst();
        }
        System.out.println(count);
    }
}
