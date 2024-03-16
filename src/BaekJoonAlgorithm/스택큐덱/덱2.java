package BaekJoonAlgorithm.스택큐덱;

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

        public void enqueFront(int x){
            num++;
            if (--front<0)
                front=capacity-1;
            deck[front] =x;
        }

        public void enqueRear(int x){
            deck[rear++]=x;
            num++;
            if (rear==capacity)
                rear=0;
        }

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

        public int size(){
            return num;
        }

        public int empty(){
            if (num<=0)
                return 1;
            else
                return 0;
        }

        public int peekFront(){
            if (num<=0){
                return -1;
            }
            return deck[front];

        }

        public int peekRear(){
            if (num<=0){
                return -1;
            }

            return deck[rear==0?capacity-1:rear-1];
        }
    }
}
