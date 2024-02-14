package Do_It_Book.chapter4.stack;

/**
 * 스택을 데이터 입출력방법
 * 후입선출 을 사용한다. 즉-> 나중에 들어간 데이터가 제일먼저 나오는 구조
 * ex)
 * push -> 1,2,3,4 pop ->4,3,2,1
 */
public class IntStack {

    private int[] stk; //스택용 배열
    private int capacity; //스택 용량
    private int ptr; //스택용 포인트

    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException(){}
    }

    public IntStack(int maxLen){
        ptr = 0;
        capacity = maxLen;
        try{
            stk = new int[capacity];
        }catch (OutOfMemoryError e){
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if(ptr>= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if(ptr <=0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException{
        if (ptr<=0)
            throw new EmptyIntStackException();
        return stk[ptr-1];
    }

    public void clear(){
        ptr = 0;
    }

    //값이 포함되어 있는지 확인하는 메서드
    public int indexOf(int x){
        for (int i=ptr-1;i>=0; i--)
            if (stk[i] ==x)
                return i;
        return -1;
    }

    public int getCapacity(){
        return capacity;
    }

    public int size(){
        return ptr;
    }

    public boolean isEmpty(){
        return ptr<=0;
    }

    public boolean isFull(){
        return ptr>=capacity;
    }

    public void dump(){
        if (ptr <=0)
            System.out.println("스특이 비어있습니다.");
        else {
            for (int i=0;i<ptr;i++)
                System.out.print(stk[i]+" ");
            System.out.println();
        }

    }
}
