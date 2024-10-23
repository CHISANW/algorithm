package BaekJoonAlgorithm.브루트포스;

import java.util.*;

public class 기타콘서트 {
    static Guitar[] guitars;
    static int[] index;
    static int n, m, maxPlay, guitarNum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int result = 0;

        index = new int[n];
        guitars = new Guitar[n];

        for (int i =0; i<n;i++){
            String name = sc.next();
            boolean[] song = new boolean[m];
            String play = sc.next();
            int can = 0;

            for (int j =0; j<m;j++){
                song[j] = play.charAt(j) == 'Y';

                if (song[j]){
                    can++;
                    result++;
                }
            }
            guitars[i] = new Guitar(name,song,can);
        }

        for (int i =1; i<=n;i++){
            combine(0,0,i);
        }
        if (result == 0) {
            System.out.println(-1);
        }else {
            System.out.println(guitarNum);
        }
    }

    static void combine(int count, int start, int max){
        if (count == max){
           check(max);
           return;
        }

        for (int i = start ; i<n;i++){
            index[count] = i;
            combine(count+1,i+1,max);
        }
    }

    static void check(int max){
        int can = 0;
        for (int i = 0; i<m;i++){
            boolean check = guitars[index[0]].song[i];

            if (!check){
                for (int j =1; j<max;j++){
                    check = guitars[index[j]].song[i] || check;
                }
            }

            if (check) can++;
        }

        if (maxPlay < can){
            maxPlay = can;
            guitarNum = max;
        }
    }

    static class Guitar{
        String name;
        boolean[] song;
        int canPlay;

        public Guitar(String name, boolean[] song, int canPlay) {
            this.name = name;
            this.song = song;
            this.canPlay = canPlay;
        }
    }
}
