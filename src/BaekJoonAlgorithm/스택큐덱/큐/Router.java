package BaekJoonAlgorithm.스택큐덱.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Router {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        Queue<Integer> q = new LinkedList<>();

        while (true) {
            int r = stdIn.nextInt();

            if (r == 0) {
                if (!q.isEmpty()) q.poll();
            } else {
                if (q.size() < N&& r!=-1) {
                    q.add(r);
                }
            }
            if (r == -1) {
                break;
            }
        }

        if (q.isEmpty()){
            System.out.println("empty");
        }else{
            for (Integer integer : q) {
                System.out.print(integer+" ");
            }
        }
    }
}
