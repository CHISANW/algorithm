package BaekJoonAlgorithm.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 시리얼번호 {
    static class Serial{
        String serial;
        int sum;

        public Serial(String serial) {

            this.serial = serial;
            for (int i = 0; i < serial.length(); i++)
                if ('0' <= serial.charAt(i) && serial.charAt(i) <= '9')
                    sum += serial.charAt(i) - '0';      // ex) 문자 3 ->ASCII 는 51 이므로 0(48)을 뺴주면 숫자 3이나온다.
            }
        }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        Serial[] serials = new Serial[n];

        for (int i =0;i<n;i++){
            serials[i]= new Serial(stdIn.next());
        }

        Arrays.sort(serials, new Comparator<Serial>() {
            @Override
            public int compare(Serial o1, Serial o2) {
                if (o1.serial.length()!= o2.serial.length()){
                    return o1.serial.length() - o2.serial.length();
                }
                if (o1.sum != o2.sum){
                    return o1.sum - o2.sum;
                }
                return o1.serial.compareTo(o2.serial);

            }
        });

        for (Serial serial : serials) {
            System.out.println(serial.serial);
        }
    }
}
