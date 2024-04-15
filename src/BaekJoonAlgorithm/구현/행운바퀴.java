package BaekJoonAlgorithm.구현;

import java.util.Arrays;
import java.util.Scanner;

public class 행운바퀴 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();

        char[] wheel = new char[n];
        Arrays.fill(wheel,'?');

        int curlIndex = 0;
        while (k-- >0){
            int step = stdIn.nextInt();
            char nextAlphabet = stdIn.next().charAt(0);
            int nextIndex = ((curlIndex-step)%n+n)%n;
            if (wheel[nextIndex]=='?') wheel[nextIndex] = nextAlphabet;
            else if (wheel[nextIndex] != nextAlphabet) {
                System.out.println("!");
                return;
            }
            curlIndex = nextIndex;
        }

        boolean[] used = new boolean[26];
        for (int i=0;i<n;i++){
            if (wheel[i]=='?')continue;
            if (used[wheel[i]-'A']){
                System.out.println("!");
                return;
            }
            used[wheel[i]-'A']=true;
        }

        for (int i =0;i<n;i++)
            System.out.print(wheel[(curlIndex+i)%n]);
        System.out.println();
    }
}
