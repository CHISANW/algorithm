package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class solve_5635 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Person> people = new PriorityQueue<>();
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            people.add(new Person(name, year, month, day));
        }

        StringBuilder sb = new StringBuilder();
        sb.append(people.poll().name).append("\n");
        while (people.size() > 1){
            people.poll();
        }
        sb.append(people.poll().name);
        System.out.println(sb.toString());
        br.close();
    }

    static class Person implements Comparable<Person>{
        String name;

        int year;

        int month;

        int day;

        public Person(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }

        @Override
        public int compareTo(Person o) {
            if(o.year != this.year) return o.year - this.year;
            if(o.month != this.month) return o.month - this.month;
            return o.day - this.day;
        }
    }
}
