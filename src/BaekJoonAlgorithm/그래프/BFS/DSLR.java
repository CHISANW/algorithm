package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class DSLR {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int in = sc.nextInt();
            int out =sc.nextInt();

            char[] cmd = {'D','S','L','R'};
            Queue<Register> q = new LinkedList<>();
            boolean[] check = new boolean[10000];

            q.add(new Register(in,new StringBuilder()));
            check[in] = true;

            while(!q.isEmpty()){
                Register now = q.poll();
                if(now.data == out){
                    System.out.println(now.sb);
                    break;
                }

                int[] next = {now.D(), now.S(), now.L(), now.R()};

                for(int i=0;i<4;i++){
                    if(!check[next[i]]){
                        check[next[i]] =true;
                        q.add(new Register(next[i],new StringBuilder(now.sb).append(cmd[i])));
                    }
                }
            }
        }

    }

    static class Register{
        int data;
        StringBuilder sb;

        public Register(int data, StringBuilder sb) {
            this.data = data;
            this.sb = sb;
        }

        int D(){
            return data*2 % 10000;
        }

        int S(){
            return data-1<0 ? 9999: data-1;
        }

        int L(){
            return (data%1000)*10+data/1000;
        }

        int R(){
            return (data%10)*1000 + data/10;
        }
    }
}
