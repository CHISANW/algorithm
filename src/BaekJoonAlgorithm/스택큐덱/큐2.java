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
            num = front = rear = 0;     //해당을 모두 0으로 변수 초기화
            capacity=max;       //배열의 용량을 넘어온 파라미터값으로 설정
            que = new int[capacity];        //용량의 값으로 큐의 배열용량 초기화
        }

        //파라미터 x의 값으로 인큐 실행 rear의 값을 증가해주면 되며 rear의 값이 용량보다 커지면 배열의 처음으로 초기화
        public void push(int x){
            que[rear++]= x;
            num++;
            if (rear==capacity)
                rear=0;
        }

        //인큐 만약 num이 0이라면 -1반환하며 front과 용량과 같다면 0으로 초기화
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

        //num값만 반환해 개수 확인
        public int size(){
            return num;
        }

        public int empty(){
            if (num>0)return 0;
            else return 1;
        }

        //논리적 위치 front만 반환
        public int front(){
            if (num<=0){
                return -1;
            }else
            return que[front];
        }

        //논리적 위치인 rear의 -1을 반환
        public int back(){
            if (num<=0){
                return -1;
            }
            return que[rear-1];
        }
    }
}
