package Do_It_Book.chapter2;

import java.util.Random;
import java.util.Scanner;

/**
 * Random 함수로 최댓값 구하기
 * P.63
 */
public class MaxOfArrayRand {

    static int maxOf(int[] a){
        int max = a[0];
        for (int i =1; i<a.length;i++)
            if(a[i] >max)
                max = a[i];
            return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수: ");
        int num = stdIn.nextInt();

        int[] height = new int[num];

        System.out.println("킷 값은 아래와 같습니다. ");
        for (int i=0;i<num;i++){
            height[i] = 100+random.nextInt(90);
            System.out.println("height["+i+"]: "+height[i]);
        }

        System.out.println("최갯값은 "+maxOf(height)+"입니다.");
    }
}
