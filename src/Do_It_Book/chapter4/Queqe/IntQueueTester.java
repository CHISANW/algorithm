package Do_It_Book.chapter4.Queqe;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue queue = new IntQueue(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n",queue.size(),queue.getCapacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (0) 종료");

            int result = stdIn.nextInt();
            if (result == 0)break;

            int num;
            switch (result){
                case 1:
                    System.out.print("데이터 : ");
                    num = stdIn.nextInt();
                    try{
                        queue.enque(num);
                    }catch (IntQueue.FullIntQueueException e){
                        System.out.println("큐가 가득찾습니다.");

                    }
                    break;
                case 2:
                    try{
                        num=queue.deque();
                        System.out.println("디큐한 데이터는 : "+num+"입니다.");
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        int peek = queue.peek();
                        System.out.println("피크한 데이터는: "+peek+"입니다.");
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다.");
                    }
                    break;
                case 4:
                    queue.dump();
                    break;
                case 5:
                    System.out.print("찾으려는 값을 입력하세요");
                    int i = stdIn.nextInt();
                    int search = queue.search(i);
                    System.out.println("찾으시는 값은 "+search+"에 있습니다.");

            }
        }
    }
}
