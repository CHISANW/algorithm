package BaekJoonAlgorithm.level1;

import java.util.Scanner;

/**
 * 문제번호 18108번
 * 불기연도 
 */
public class 불기연도 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int num = 543;          //불기연도
        int y = stdIn.nextInt();

        if (y>=1000 && y<=3000){
            System.out.println(y-num);
        }else {
            System.out.println("입력하신 값이 범위에 넘어값니다.");
        }
    }
}
