package BaekJoonAlgorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 나이순정렬 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        Member[] members = new Member[n];

        for (int i =0;i<n;i++){
            int age = stdIn.nextInt();
            String name = stdIn.next();
            members[i]= new Member(age, name);
        }

        Arrays.sort(members);

        for (Member member : members) {
            System.out.println(member.age+" "+member.name);
        }

    }

    static class Member implements Comparable<Member>{
        int age;
        String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
          return this.age-o.age;
        }
    }
}
