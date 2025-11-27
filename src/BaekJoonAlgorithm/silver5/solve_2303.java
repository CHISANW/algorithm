package BaekJoonAlgorithm.silver5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class solve_2303 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] arr = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            Value v = brute(arr);
            list.add(new Person(v, i));
        }

        list.sort(Comparator.naturalOrder());

        // 문제는 번호가 1부터 시작
        System.out.println(list.get(0).index + 1);
    }

    static Value brute(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int mod = (arr[i] + arr[j] + arr[k]) % 10;
                    max = Math.max(max, mod);
                }
            }
        }
        return new Value(max);
    }

    static class Value {
        int mod;
        public Value(int mod) {
            this.mod = mod;
        }
    }

    static class Person implements Comparable<Person> {
        int value;
        int index;

        public Person(Value v, int index) {
            this.value = v.mod;
            this.index = index;
        }

        @Override
        public int compareTo(Person o) {
            if (this.value != o.value) return o.value - this.value; // mod DESC
            return o.index - this.index; // index DESC
        }
    }
}