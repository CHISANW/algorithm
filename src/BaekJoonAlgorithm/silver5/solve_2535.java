package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class solve_2535 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Student> list = new ArrayList<>();

        for(int i =0; i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int _class = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            list.add(new Student(_class, grade, score));
        }
        list.sort((a, b) -> b.score - a.score);

        Map<Integer, Integer> countryCount = new HashMap<>();
        int printed = 0;

        for (Student student : list) {
            Integer cnt = countryCount.getOrDefault(student.country, 0);
            if(cnt < 2){
                System.out.println(student.country + " " + student.student);
                countryCount.put(student.country, cnt+1);
                printed++;
            }
            if(printed == 3) break;
        }

    }

    static class Student {
        int country;
        int student;
        int score;

        public Student(int country, int student, int score) {
            this.country = country;
            this.student = student;
            this.score = score;
        }
    }
}
