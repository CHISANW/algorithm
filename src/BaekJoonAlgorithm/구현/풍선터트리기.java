package BaekJoonAlgorithm.구현;

import java.util.*;

public class 풍선터트리기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Balloon> balloonList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            balloonList.add(new Balloon(i, sc.nextInt()));
        }

        StringBuilder sb = new StringBuilder();
        int index = 0;

        while (!balloonList.isEmpty()) {
            Balloon balloon = balloonList.get(index);
            sb.append(balloon.index).append(" ");
            int cost = balloon.cost;
            balloonList.remove(index);

            if (balloonList.isEmpty()) {
                break;
            }

            if (cost > 0) {
                index = (index + cost - 1) % balloonList.size();
            } else {
                index = (index + cost) % balloonList.size();
                if (index < 0) {
                    index += balloonList.size();
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}

class Balloon {
    int index;
    int cost;

    public Balloon(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

}
