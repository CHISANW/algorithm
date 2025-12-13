package BaekJoonAlgorithm.silver4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class solve_10825 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();
        for(int i = 0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int korean = Integer.parseInt(st.nextToken());
            int english = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Person(name, korean, math, english));
        }

        list.sort((a, b) -> a.compareTo(b));

        for(Person p : list){
            System.out.println(p.name);
        }

    }

    public static class Person implements Comparable<Person>{
        String name;
        int korean;
        int math;
        int english;

        public Person(String name, int korean, int math, int english) {
            this.name = name;
            this.korean = korean;
            this.math = math;
            this.english = english;
        }

        @Override
        public int compareTo(Person o) {
            if (this.korean != o.korean)
                return o.korean - this.korean;   // 국어 ↓

            if (this.english != o.english)
                return this.english - o.english; // 영어 ↑

            if (this.math != o.math)
                return o.math - this.math;       // 수학 ↓

            return this.name.compareTo(o.name);  // 이름 ↑
        }

    }
}

