package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 톱니바퀴 {
    static int[] a = new int[8];
    static int[] b = new int[8];
    static int[] c = new int[8];
    static int[] d = new int[8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        String strC = sc.next();
        String strD = sc.next();

        for (int i = 0; i < strA.length(); i++) {
            a[i] = (strA.charAt(i) - '0');
            b[i] = (strB.charAt(i) - '0');
            c[i] = (strC.charAt(i) - '0');
            d[i] = (strD.charAt(i) - '0');
        }

        int n = sc.nextInt();
        while (n-- > 0) {
            int cogwheel = sc.nextInt();
            int direction = sc.nextInt();
            boolean[] visited = new boolean[4];
            rotateCogwheels(cogwheel, direction, visited);

        }

        calculateAndPrintScore();
    }

    static void rotateCogwheels(int cogwheel, int direction, boolean[] visited) {
        if (cogwheel < 1 || cogwheel > 4 || visited[cogwheel - 1]) return;

        visited[cogwheel - 1] = true;
        int a2 = a[2];
        int b2 = b[2];
        int b6 = b[6];
        int c2 = c[2];
        int c6 = c[6];
        int d6 = d[6];

        twin(cogwheel, direction);

        if (cogwheel == 1) {
            if (a2 != b6) { // 1번 톱니바퀴와 2번 톱니바퀴 비교
                rotateCogwheels(2, -direction, visited);
            }
        } else if (cogwheel == 2) {
            if (b6 != a2) { // 2번 톱니바퀴와 1번 톱니바퀴 비교
                rotateCogwheels(1, -direction, visited);
            }
            if (b2 != c6) { // 2번 톱니바퀴와 3번 톱니바퀴 비교
                rotateCogwheels(3, -direction, visited);
            }
        } else if (cogwheel == 3) {
            if (c6 != b2) { // 3번 톱니바퀴와 2번 톱니바퀴 비교
                rotateCogwheels(2, -direction, visited);
            }
            if (c2 != d6) { // 3번 톱니바퀴와 4번 톱니바퀴 비교
                rotateCogwheels(4, -direction, visited);
            }
        } else { // 4번 톱니바퀴
            if (d6 != c2) { // 4번 톱니바퀴와 3번 톱니바퀴 비교
                rotateCogwheels(3, -direction, visited);
            }
        }
    }


    static void twin(int cogwheel, int type) {
        switch (cogwheel) {
            case 1:
                rotateCogwheel(a, type);
                break;
            case 2:
                rotateCogwheel(b, type);
                break;
            case 3:
                rotateCogwheel(c, type);
                break;
            case 4:
                rotateCogwheel(d, type);
                break;
        }
    }

    static void rotateCogwheel(int[] cogwheel, int direction) {
        if (direction == 1) { // 시계 방향
            int next = cogwheel[7];
            for (int i = 7; i > 0; i--) {
                cogwheel[i] = cogwheel[i - 1];
            }
            cogwheel[0] = next;
        } else { // 반시계 방향
            int next = cogwheel[0];
            for (int i = 0; i < 7; i++) {
                cogwheel[i] = cogwheel[i + 1];
            }
            cogwheel[7] = next;
        }
    }

    static void calculateAndPrintScore() {
        int score = 0;
        if (a[0] == 1) score += 1; // 1번 톱니바퀴
        if (b[0] == 1) score += 2; // 2번 톱니바퀴
        if (c[0] == 1) score += 4; // 3번 톱니바퀴
        if (d[0] == 1) score += 8; // 4번 톱니바퀴
        System.out.println(score);
    }
}
