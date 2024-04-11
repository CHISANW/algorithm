package BaekJoonAlgorithm.문자열;

import java.util.Scanner;

public class 소금폭탄 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] current = stdIn.next().split(":");
        String[] target = stdIn.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMinute = Integer.parseInt(current[1]);
        int currentSecond = Integer.parseInt(current[2]);

        int targetHour = Integer.parseInt(target[0]);
        int targetMinute = Integer.parseInt(target[1]);
        int targetSecond = Integer.parseInt(target[2]);

        int currentAmountTime = currentHour*3600+currentMinute*60+currentSecond;
        int targetAmountTime = targetHour*3600+targetMinute*60+targetSecond;

        int NeedAmountSecond = targetAmountTime- currentAmountTime;
        if (NeedAmountSecond<=0)
            NeedAmountSecond += 24*3600;

        int NeedHour = NeedAmountSecond/3600;
        int NeedMinute = (NeedAmountSecond%3600) /60;
        int NeedSecond = NeedAmountSecond%60;

        System.out.printf("%02d:%02d:%02d",NeedHour,NeedMinute,NeedSecond);
    }
}
