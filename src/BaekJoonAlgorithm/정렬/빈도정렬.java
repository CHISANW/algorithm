package BaekJoonAlgorithm.정렬;

import java.util.*;

public class 빈도정렬 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int c = stdIn.nextInt();

        Map<Integer,Integer> map = new LinkedHashMap<>() ;
        for (int i =0;i<n;i++) {
            int message = stdIn.nextInt();
            map.put(message, map.getOrDefault(message, 0)+1);
        }

        Integer[] array = map.keySet().toArray(new Integer[map.size()]);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2)-map.get(o1);
            }
        });

        for (int integer : array) {
            int count = map.get(integer);
            while (count-- > 0){
                System.out.print(integer+" ");
            }
        }
        System.out.println();
    }
}
