package BaekJoonAlgorithm.silver5;

import java.util.*;

public class solve_2238 {
    static class Bid {
        String name;
        int price;
        int order;

        public Bid(String name, int price, int order) {
            this.name = name;
            this.price = price;
            this.order = order;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int n = sc.nextInt();

        Map<Integer, List<Bid>> map = new HashMap<>();
        for(int i =0; i<n;i++){
            String name = sc.next();
            int price = sc.nextInt();
            map.putIfAbsent(price, new ArrayList<>());
            map.get(price).add(new Bid(name, price, i));
        }

        int minCount = Integer.MAX_VALUE;
        List<Integer> candidatePrices = new ArrayList<>();

        for (Map.Entry<Integer, List<Bid>> e : map.entrySet()) {
            int count = e.getValue().size();
            if (count < minCount) {
                minCount = count;
                candidatePrices.clear();
                candidatePrices.add(e.getKey());
            } else if (count == minCount) {
                candidatePrices.add(e.getKey());
            }
        }

        int finalPrice = Collections.min(candidatePrices);
        List<Bid> candidates = map.get(finalPrice);

        candidates.sort(Comparator.comparingInt(b -> b.order));

        System.out.println(candidates.get(0).name + " " + finalPrice);
    }

}
