package BaekJoonAlgorithm.정렬;

import java.util.*;

public class 회의실배정 {
    static class MeetTing{
        int start;
        int end;

        public MeetTing(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();

        MeetTing[] meetTings = new MeetTing[n];

        for (int i =0;i<n;i++){
            meetTings[i] = new MeetTing(stdIn.nextInt(), stdIn.nextInt());
        }

        Arrays.sort(meetTings, new Comparator<MeetTing>() {
            @Override
            public int compare(MeetTing o1, MeetTing o2) {
                if (o1.end==o2.end){
                    return o1.start- o1.start;
                }
                return o1.end - o2.end;
            }
        });

        int cnt =0;
        int ended =0;

        for (MeetTing meetTing : meetTings){
            if (ended<=meetTing.start){
                cnt++;
                ended = meetTing.end;;
            }
        }
        System.out.println(cnt);
    }
}
