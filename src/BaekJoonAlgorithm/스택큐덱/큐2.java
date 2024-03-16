package BaekJoonAlgorithm.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 18258번
 */
public class 큐2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        Queue queue = new Queue(n);

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String token = st.nextToken();
            switch (token){
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    queue.push(x);
                    break;
                case "pop":
                    int pop = queue.pop();
                    sb.append(pop+"\n");
                    break;
                case "size":
                    int size = queue.size();
                    sb.append(size+"\n");
                    break;
                case "empty":
                    int empty = queue.empty();
                    sb.append(empty+"\n");
                    break;
                case "front":
                    int front = queue.front();
                    sb.append(front+"\n");
                    break;
                case "back":
                    int back = queue.back();
                    sb.append(back+"\n");
                    break;
            }
        }

        System.out.println(sb);
        br.close();
    }

    public static class Queue{
        private int[] que;          // 큐의 용량
        private int front;          // 맨 앞
        private int rear;           // 맨끝
        private int num;            // 배열의 요소수 갯수
        private int capacity;      // 배열 용량

        public Queue(int max){
            num = front = rear = 0;
            capacity=max;
            que = new int[capacity];
        }

        public void push(int x){
            que[rear++]= x;
            num++;
            if (rear==capacity)
                rear=0;
        }

        public int pop(){
            if (num<=0) {
                return -1;
            }
            int x= que[front++];
            num--;

            if (front==capacity)
                front=0;
            return x;
        }

        public int size(){
            return num;
        }

        public int empty(){
            if (num>0)return 0;
            else return 1;
        }

        public int front(){
            if (num<=0){
                return -1;
            }else
            return que[front];
        }

        public int back(){
            if (num<=0){
                return -1;
            }
            return que[(rear-1)%capacity];
        }
    }
}
