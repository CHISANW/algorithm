package BaekJoonAlgorithm.그래프;

import java.util.HashSet;
import java.util.Set;

public class 단어변환 {
    public static void main(String[] args) {
        String[] parts = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution("hit", "cog", parts));

        String[] parts1 = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solution("hit", "cog", parts1));
    }

    static String[] word;

    static int solution(String begin, String target, String[] words) {
        int answer = 0;
        word = words;

        Set<String> visited = new HashSet<>();
        answer = dfs(begin, target, visited);
        return answer == Integer.MAX_VALUE ? 0 : answer;
    }

    static int dfs(String begin, String target, Set<String> visited) {
        if (begin.equals(target)) {
            return 0;
        }

        if (visited.contains(begin)) {
            return Integer.MAX_VALUE;
        }

        visited.add(begin);
        int minCount = Integer.MAX_VALUE;

        for (String word : word) {
            if (isOneLetterDifferent(begin, word)) {
                int result = dfs(word, target, visited);
                if (result != Integer.MAX_VALUE) {
                    minCount = Math.min(minCount, result + 1);
                }
            }
        }

        visited.remove(begin);
        return minCount;
    }

    static boolean isOneLetterDifferent(String a, String b) {
        int diffCount = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 1;
    }
}
