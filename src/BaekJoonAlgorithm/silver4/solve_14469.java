package BaekJoonAlgorithm.silver4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solve_14469 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Cow> cows = new ArrayList<>();
        for(int i =0; i<n;i++){
            cows.add(new Cow(sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(cows);

        int currentTime = 0;

        for(Cow cow : cows){
            if(currentTime < cow.start){
                currentTime = cow.start;
            }
            currentTime += cow.time;
        }
        System.out.println(currentTime);

    }

    static class Cow implements  Comparable<Cow>{
        int start;
        int time;

        public Cow(int start, int time) {
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Cow o) {
            return this.start - o.start;
        }

    }
}
