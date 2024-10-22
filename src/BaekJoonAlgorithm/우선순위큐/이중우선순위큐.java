package BaekJoonAlgorithm.우선순위큐;

import java.util.*;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        String[] value = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
        System.out.println(Arrays.toString(solution(value)));

        String[] value1 = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        System.out.println(Arrays.toString(solution(value1)));

    }

    static PriorityQueue<Integer> maxQ;
    static PriorityQueue<Integer> minQ;
    static Map<Integer, Integer> syncMap;

    static int[] solution(String[] operations) {


        maxQ = new PriorityQueue<>((o1, o2) -> o2 - o1);
        minQ = new PriorityQueue<>();
        syncMap = new HashMap<>();

        for (String part : operations) {
            String[] parts = part.split(" ");
            String type = parts[0];
            int value = Integer.parseInt(parts[1]);
            if (type.equals("I")) {
                insertQ(value);
            } else if (type.equals("D")) {
                if (value == 1) {
                    pollMax();
                } else {
                    pollMin();
                }
            }
        }
        int[] answer = new int[2];

        if (!maxQ.isEmpty() && !minQ.isEmpty() ){
            cleanQueues();
            answer[0] = maxQ.peek();
            answer[1] = minQ.poll();
        }
        return answer;
    }

    static void insertQ(int value) {
        maxQ.add(value);
        minQ.add(value);
        syncMap.put(value,syncMap.getOrDefault(value,0)+1);
    }

    static void pollMax() {
        cleanQueues();
        if (!maxQ.isEmpty()) {
            Integer maxValue = maxQ.poll();
            syncMap.put(maxValue,syncMap.get(maxValue)-1);
        }
    }

    static void pollMin(){
        cleanQueues();
        if (!minQ.isEmpty()){
            Integer minValue = minQ.poll();
            syncMap.put(minValue,syncMap.get(minValue)-1);
        }
    }
    static void  cleanQueues(){
        while (!maxQ.isEmpty() && syncMap.get(maxQ.peek()) == 0) {
            maxQ.poll();
        }
        while (!minQ.isEmpty() && syncMap.get(minQ.peek()) == 0) {
            minQ.poll();
        }
    }
}
