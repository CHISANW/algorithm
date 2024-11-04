package BaekJoonAlgorithm.구현;

import java.util.*;

public class BaekJoon_1706 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int C = scanner.nextInt();
        scanner.nextLine();

        char[][] puzzle = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = scanner.nextLine();
            puzzle[i] = line.toCharArray();
        }

        List<String> words = new ArrayList<>();


        for (int i = 0; i < R; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = 0; j < C; j++) {
                if (puzzle[i][j] == '#') {
                    if (word.length() >= 2) {
                        words.add(word.toString());
                    }
                    word.setLength(0);
                } else {
                    word.append(puzzle[i][j]);
                }
            }
            if (word.length() >= 2) {
                words.add(word.toString());
            }
        }

        for (int j = 0; j < C; j++) {
            StringBuilder word = new StringBuilder();
            for (int i = 0; i < R; i++) {
                if (puzzle[i][j] == '#') {
                    if (word.length() >= 2) {
                        words.add(word.toString());
                    }
                    word.setLength(0);
                } else {
                    word.append(puzzle[i][j]);
                }
            }
            if (word.length() >= 2) {
                words.add(word.toString());
            }
        }

        Collections.sort(words);
        System.out.println(words.get(0));

        scanner.close();
    }
}
