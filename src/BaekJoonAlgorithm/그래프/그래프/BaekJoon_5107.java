package BaekJoonAlgorithm.그래프.그래프;

import java.util.*;

public class BaekJoon_5107 {
    static Map<String, List<String>> graph;
    static Set<String> visited;
    static Set<String> onPath;
    static int caseNum = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            graph = new HashMap<>();
            visited = new HashSet<>();
            onPath = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String from = sc.next();
                String to = sc.next();
                graph.putIfAbsent(from, new ArrayList<>());
                graph.putIfAbsent(to, new ArrayList<>());
                graph.get(from).add(to);
            }

            int cycleCount = 0;
            for (String person : graph.keySet()) {
                if (!visited.contains(person)) {
                    if (dfs(person)) {
                        cycleCount++;
                    }
                }
            }
            System.out.println(caseNum++ + " " + cycleCount);
        }
    }

    static boolean dfs(String node) {
        if (onPath.contains(node)) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }

        visited.add(node);
        onPath.add(node);

        for (String neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (dfs(neighbor)) {
                return true;
            }
        }

        onPath.remove(node);
        return false;
    }


    static void solution1() {
        Scanner sc = new Scanner(System.in);

        int solution1Count = 1;
        while (true) {
            int value = sc.nextInt();
            if (value == 0) {
                break;
            }

            graph = new HashMap<>();
            visited = new HashSet<>();

            for (int i = 0; i < value; i++) {
                String to = sc.next();
                String from = sc.next();
                graph.putIfAbsent(to, new ArrayList<>());
                graph.putIfAbsent(from, new ArrayList<>());
                graph.get(to).add(from);
            }
            int count = 0;

            for (String now : graph.keySet()) {
                if (!visited.contains(now)) {
                    solutionBfs(now);
                    count++;
                }
            }

            System.out.println(solution1Count++ + " " + count);
        }
    }

    static void solutionBfs(String start) {
        Queue<String> queue = new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            for (String next : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }
    }

}
