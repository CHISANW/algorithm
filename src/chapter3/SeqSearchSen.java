package chapter3;

import java.util.Scanner;

/**
 * 보초법을 활용한 선형검색
 * 보초법은 원래 배열에 찾을 값을 저장해두고 조건문을 한줄 줄일떄 사용한다.
 */
public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n,int key){
        int i =0;

        a[n] = key;

        while (true){
            if(a[i]==key)
                break;
            i++;
        }
        return i==n ? -1:i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num+1];

        for(int i=0;i<num;i++){
            System.out.print("x["+i+"]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = stdIn.nextInt();

        int searchSen = seqSearchSen(x, num, key);

        if(searchSen== -1)
            System.out.println("찾는 값이 없습니다.");
        else
            System.out.println("찾는 값은 x["+searchSen+"]에 있습니다.");
        }

    }

