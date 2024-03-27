package BaekJoonAlgorithm.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 문제번호 28278번
 */
public class 스택2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = Integer.parseInt(br.readLine());

        Stack stack = new Stack(max);

        for (int i =0;i<max;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int token = Integer.parseInt(st.nextToken());
            switch (token){
                case 1:
                    int token1 = Integer.parseInt(st.nextToken());
                    stack.push(token1);
                    break;
                case 2:
                    int pop = stack.pop();
                    sb.append(pop+"\n");
                    break;
                case 3:
                    int check = stack.check();
                    sb.append(check+"\n");
                    break;
                case 4:
                    int empty = stack.isEmpty();
                    sb.append(empty+"\n");
                    break;
                case 5:
                    int peek = stack.peek();
                    sb.append(peek+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static class Stack{
        private int[] arr;      // 스택용 배열
        private int ptr;        // 스택 현재 위치

        public Stack(int x){
            ptr=0;
            arr=new int[x];     //스택배열 생성
        }
        public int push(int x){     //1번
            return arr[ptr++]= x;
        }

        public int pop(){           //2번
            if (ptr > 0)
                return arr[--ptr];
            return -1;
        }
        public int check(){         //3번
            return ptr;
        }

        public int isEmpty(){       //4번
            return ptr <= 0 ? 1 : 0;
        }

        public int peek(){          //5번
            return ptr > 0 ? arr[ptr - 1] : -1;
        }
    }
}
