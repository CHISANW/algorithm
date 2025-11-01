package BaekJoonAlgorithm.silver5;

import java.util.PriorityQueue;
import java.util.Scanner;

public class solve_1417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1){
            System.out.println(0);
            return;
        }

        PriorityQueue<Person> people = new PriorityQueue<>();
        int main = sc.nextInt();
        for(int i =1; i<n;i++){
            people.add(new Person(sc.nextInt()));
        }

        int ans = 0;
        while (true){
            Person poll = people.poll();
            if(main > poll.bote){
                break;
            }
            ans++;
            main++;
            poll.bote--;
            if(poll.bote > 0){
                people.add(poll);
            }
        }
        System.out.println(ans);

    }

    static class Person implements Comparable<Person>{
        int bote;

        public Person(int bote) {
            this.bote = bote;
        }

        @Override
        public int compareTo(Person p){
            return p.bote - this.bote;
        }
    }
}
