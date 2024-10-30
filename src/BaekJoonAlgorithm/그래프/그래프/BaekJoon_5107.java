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
            if (n == 0) break;

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
}
