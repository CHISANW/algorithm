package BaekJoonAlgorithm.그래프.BFS;

import java.util.*;

public class AtoB {
    static int a,b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        Queue<Status> q = new LinkedList<>();
        Set<Long> visited = new HashSet<>();

        q.add(new Status(a, 0));
        visited.add((long) a);

        int answer = -1;

        while (!q.isEmpty()) {
            Status now = q.poll();


            if (now.value == b) {
                answer = now.count + 1;
                break;
            }


            long multiValue = (long) now.value * 2;
            long plusValue = (long) now.value * 10 + 1;


            if (multiValue <= b && !visited.contains(multiValue)) {
                q.add(new Status((int) multiValue, now.count + 1));
                visited.add(multiValue);
            }

            if (plusValue <= b && !visited.contains(plusValue)) {
                q.add(new Status((int) plusValue, now.count + 1));
                visited.add(plusValue);
            }
        }


        System.out.println(answer);
    }

    static class Status {
        int value;
        int count;

        public Status(int value, int count) {
            this.value = value;
            this.count = count;
        }
    }
}
