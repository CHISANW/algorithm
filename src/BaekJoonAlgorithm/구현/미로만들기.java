package BaekJoonAlgorithm.구현;

import java.util.*;

public class 미로만들기 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1}; // 남, 동, 북, 서

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String movements = sc.next();

        int x = 0, y = 0, dir = 0;

        List<int[]> path = new ArrayList<>();
        path.add(new int[]{x, y});

        for (char move : movements.toCharArray()) {
            if (move == 'L') {
                dir = (dir + 1) % 4;
            } else if (move == 'R') {
                dir = (dir + 3) % 4;
            } else if (move == 'F') {
                x += dx[dir];
                y += dy[dir];
                path.add(new int[]{x, y});
            }
        }

        int minX = 0, minY = 0, maxX = 0, maxY = 0;
        for (int[] p : path) {
            minX = Math.min(minX, p[0]);
            minY = Math.min(minY, p[1]);
            maxX = Math.max(maxX, p[0]);
            maxY = Math.max(maxY, p[1]);
        }

        int height = maxX - minX + 1;
        int width = maxY - minY + 1;
        char[][] maze = new char[height][width];

        for (int i = 0; i < height; i++) {
            Arrays.fill(maze[i], '#');
        }

        for (int[] p : path) {
            maze[p[0] - minX][p[1] - minY] = '.';
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }
}
