package BaekJoonAlgorithm.테스트;

import java.util.*;
import java.util.stream.Collectors;

public class 후보추천하기 {
    static class Student{
        int number;
        int scr;
        int postedAt;

        public Student(int number, int scr, int postedAt) {
            this.number = number;
            this.scr = scr;
            this.postedAt = postedAt;
        }
    }
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int R = stdIn.nextInt();

        List<Student> post = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            int votedNumber = stdIn.nextInt();
            boolean alreadyPosted = false;

            for (int j = 0; j < post.size(); j++)
                if (post.get(j).number == votedNumber) {
                    post.get(j).scr++;
                    alreadyPosted = true;
                    break;
                }

            if (!alreadyPosted) {
                if (post.size() < N) post.add(0, new Student(votedNumber, 1, i));
                else {
                    Collections.sort(post, (o1, o2) ->
                            o1.scr == o2.scr ? o1.postedAt - o2.postedAt : o1.scr - o2.scr);
                    post.set(0, new Student(votedNumber, 1, i));
                }
            }
        }

        Collections.sort(post, (o1, o2) -> o1.number - o2.number);

        List<Student> collect = post.stream().collect(Collectors.toList());
        for (Student student : collect) {
            System.out.print(student.number+" ");
        }

    }
}
