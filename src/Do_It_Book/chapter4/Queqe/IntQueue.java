package Do_It_Book.chapter4.Queqe;

/**
 * 큐를 이용한 알고리즘
 * 데이터를 넣는과정 in-Queue , 뺴는과정 de-Queue, 데이터가 나온느 입구 front 데이터가 들어가는 입구 rear(니어)
 * 주의 -> 배열로 큐를 만들수있지만 처리 복잡도가 O(n)으로 한번제거시 보두 이동하는 비용이발생해 비효울적이다.
 * 그래서 링 버퍼를 사용해 만든다 여기서 사용되는것이 놀리적으로 앞요소를 front, 뒷 요소를 rear로 정의해 하나의 원처럼 만들어 복잡가 O(1)로 
 * 나오게되어 비용이 적게 발생한다.
 */
public class IntQueue {
    private int[] que;          //큐의 배열
    private int capacity;       //큐의 용량
    private int front;          //맨 앞 요소의 커서
    private int rear;           //맨뒤 요소의 커서
    private int num;            //현재 데이터 개수

    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    public class FullIntQueueException extends RuntimeException{
        public FullIntQueueException(){}
    }

    public IntQueue(int maxLen){
        num = front =rear =0;
        capacity= maxLen;
        try{
            que= new int[capacity];
        }catch (OutOfMemoryError e){
            capacity=0;
        }
    }

    public int enque(int x)throws FullIntQueueException{
        if (num>= capacity)
            throw new FullIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear =0;
        return x;
    }

    public int deque()throws EmptyIntQueueException{
        if (num<=0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if (front==capacity)
            front=0;
        return x;
    }

    public int peek() throws EmptyIntQueueException{
        if(num<= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    public void clear(){
        front = num = rear = 0;
    }


    /**
     * (7)35 > (8)56 > (9)25 > (10)68 > (11)95 > (0)73 > (1)19
     */
    public int indexOf(int x){
        for(int i =0;i<num;i++){
            int idx = (i+front) % capacity;
            if (que[idx] ==x)
                return idx;
        }
        return -1;
    }

    public int search(int x){
        for(int i=1;i<=num;i++){
            int idx = ((i-1)+front)%capacity;
            if (que[idx]==x)
                return i;
        }
        return 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num<=0;
    }

    public boolean isFull(){
        return num>=capacity;
    }

    public void dump(){
        if(num<=0)
            System.out.println("큐가 비어있습니다.");
        else {
            for (int i =0; i<num;i++)
                System.out.print(que[i+front]%capacity+" ");
            System.out.println();
        }
    }
}
