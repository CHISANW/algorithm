package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class ALPS식_투표 {
    public static class Score{

        public Score(int staffIndex, double scr) {
            this.staffIndex = staffIndex;
            this.scr = scr;
        }
        int staffIndex;
        double scr;
    }

    public static void sortScoresDescendingOrder(Score[] arr){
        for (int i =0;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[i].scr>arr[j].scr){
                    Score cur = arr[i];
                    for (int k=i;k>j;k--){
                        arr[k] = arr[k-1];
                    }
                    arr[j] =cur;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int n = stdIn.nextInt();

        double validCut = x*0.05;
        boolean[] validCandidate = new boolean[26];
        int[] staffVote = new int[26];
        int candidate = 0;

        for (int i=0;i<n;i++){
            String name = stdIn.next();
            int vote = stdIn.nextInt();

            if (vote>= validCut){
                int index = name.charAt(0)-'A';
                validCandidate[index] = true;
                staffVote[index] = vote;
                candidate++;
            }
        }

        Score[] scores = new Score[candidate*14];
        int scoreIndex = 0;
        for (int i =0; i<26; i++){
            if (validCandidate[i]){
                for (int j = 1;j<=14;j++){
                    scores[scoreIndex++] = new Score(i,(double) staffVote[i]/j);
                }
            }
        }

        sortScoresDescendingOrder(scores);

        int[] ans = new int[26];
        for (int i =0;i<14;i++){
            ans[scores[i].staffIndex]++;
        }

        for (int i=0;i<26;i++){
            if (validCandidate[i])
                System.out.println((char)(i+'A')+" "+ans[i]);
        }
    }
}
