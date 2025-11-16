package BaekJoonAlgorithm.silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solve_8979 {
    static class Country {
        int id, gold, silver, bronze;

        Country(int id, int gold, int silver, int bronze) {
            this.id = id;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Country> list = new ArrayList<>();
        Country target = null;

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            int gold = sc.nextInt();
            int silver = sc.nextInt();
            int bronze = sc.nextInt();

            Country c = new Country(id, gold, silver, bronze);
            list.add(c);

            if (id == K) target = c;
        }

        int rank = 1;

        for (Country c : list) {
            if (isBetter(c, target)) {
                rank++;
            }
        }

        System.out.println(rank);
    }

    // c1이 c2보다 잘했는지 (금 → 은 → 동)
    static boolean isBetter(Country c1, Country c2) {
        if (c1.gold > c2.gold) return true;
        if (c1.gold == c2.gold && c1.silver > c2.silver) return true;
        return c1.gold == c2.gold && c1.silver == c2.silver && c1.bronze > c2.bronze;
    }
}
