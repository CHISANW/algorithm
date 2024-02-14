package Do_It_Book.chapter4.stack;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack intStack = new IntStack(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n",intStack.size(),intStack.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료: ");

            int num = stdIn.nextInt();
            if (num==0)break;

            int x;
            switch (num){
                case 1:
                    System.out.print("데이터: ");
                    x=stdIn.nextInt();
                    try {
                        intStack.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득찾습니다.");
                    }
                    break;

                case 2:
                    try {
                        x= intStack.pop();
                        System.out.println("팝한 데이터는 : "+x+"입니다.");

                    }catch (IntStack.EmptyIntStackException e){
                        System.out.printf("스택이 비어있습니다.");
                    }
                    break;
                case 3:
                    try {
                        x = intStack.peek();
                        System.out.printf("피크한 데이터는 : " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.printf("데이터가 비어있습니다.");
                    }
                    break;
                case 4:
                    intStack.dump();
                    break;
            }
        }

    }
}
