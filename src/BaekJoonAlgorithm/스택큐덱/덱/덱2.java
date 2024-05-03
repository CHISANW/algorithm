package BaekJoonAlgorithm.스택큐덱.덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문제번호 28279번
 */
public class 덱2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deck deck = new Deck(a);

        for (int i =0;i<a;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int token = Integer.parseInt(st.nextToken());
            switch (token){
                case 1:
                    int b = Integer.parseInt(st.nextToken());
                    deck.enqueFront(b);
                    break;
                case 2:
                    int c = Integer.parseInt(st.nextToken());
                    deck.enqueRear(c);
                    break;
                case 3:
                    int dequeFront = deck.dequeFront();
                    sb.append(dequeFront+"\n");
                    break;
                case 4:
                    int dequeRear = deck.dequeRear();
                    sb.append(dequeRear+"\n");
                    break;
                case 5:
                    int size = deck.size();
                    sb.append(size+"\n");
                    break;
                case 6:
                    int empty = deck.empty();
                    sb.append(empty+"\n");
                    break;
                case 7:
                    int peekFront = deck.peekFront();
                    sb.append(peekFront+"\n");
                    break;
                case 8:
                    int peekRear = deck.peekRear();
                    sb.append(peekRear+"\n");
                    break;
            }
        }
        System.out.println(sb);
        br.close();
    }

    public static class Deck{
        private int[] deck;
        private int front;
        private int rear;
        private int capacity;
        private int num;

        public Deck(int max){
            front = num=rear =0;
            capacity=max;
            deck= new int[capacity];
        }
        //덱의 맨앞에 데이터를 인큐
        public void enqueFront(int x){
            num++;
            if (--front<0)
                front=capacity-1;
            deck[front] =x;
        }
        //덱의 맨뒤 데이터를 인큐
        public void enqueRear(int x){
            deck[rear++]=x;
            num++;
            if (rear==capacity)
                rear=0;
        }
        //덱의 맨앞에서 데이터를 디큐
        public int dequeFront(){
            if (num<=0){
                return -1;
            }
            int x = deck[front++];
            if (front==capacity){
                front=0;
            }
            num--;
            return x;
        }
        //덱의 맨뒤에서 데이터를 디큐
        public int dequeRear(){
            if (num<=0){
                return -1;
            }
            if (--rear<0)
                rear=capacity-1;
            int x= deck[rear];
            num--;
            return x;
        }
        //--- 덱에 쌓여있는 데이터수를 반환합니다 ---//
        public int size(){
            return num;
        }
        //--- 덱이 비어 있는가? ---//
        public int empty(){
            if (num<=0)
                return 1;
            else
                return 0;
        }
        //--- 덱의 맨앞 데이터를 피크(맨앞 데이터를 들여다봄 ) ---*/
        public int peekFront(){
            if (num<=0){
                return -1;
            }
            return deck[front];

        }
        //--- 덱의 맨끝에서 데이터를 피크(맨끝 데이터를 들여다봄 ) ---*/
        public int peekRear(){
            if (num<=0){
                return -1;
            }

            return deck[rear==0?capacity-1:rear-1];
        }
    }
}
