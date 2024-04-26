package BaekJoonAlgorithm.리스트;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 요세푸스문제 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int K = stdIn.nextInt();

        List<Integer> list = new LinkedList<>();
        for (int i =1;i<=N;i++){
            list.add(i);
        }

        int[] ans = new int[N];

        int currentIndex = 0;
        for (int i =0;i<N;i++){
            currentIndex = (currentIndex+K-1) %list.size();
            ans[i]=list.remove(currentIndex);
        }

        System.out.print("<");
        for (int i=0;i<N;i++){
            if (i>0) System.out.print(", ");
            System.out.print(ans[i]);
        }
        System.out.println(">");
    }
}
