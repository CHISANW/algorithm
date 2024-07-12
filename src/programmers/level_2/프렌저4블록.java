package programmers.level_2;

public class 프렌저4블록 {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        String[] board = {"CCBDE", "AAADE", "AAABF", "CCBBF"};
        System.out.println(solution(m,n,board));
    }

    static int[] dx = {1, 0, 1};
    static int[] dy = {0, 1, 1};
    static int[][] block;
    static int row, col;
    static int answer;

    public static int solution(int m, int n, String[] board) {
        row = m;
        col = n;
        block = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {  // 'i++' -> 'j++'
                block[i][j] = board[i].charAt(j) - 'A';
            }
        }

        while (clear()) {
            move();
        }

        return answer;
    }

    static boolean clear() {
        int[][] temp = copyDeepToArray(block);
        int count = 0;

        for (int i = 0; i < row - 1; i++) {  // 범위 체크 수정 (row - 1)
            for (int j = 0; j < col - 1; j++) {  // 범위 체크 수정 (col - 1)
                boolean isRemove = true;

                for (int k = 0; k < 3; k++) {
                    int nr = i + dx[k];
                    int nc = j + dy[k];

                    if (!isRange(nr, nc) || block[nr][nc] != block[i][j]) {
                        isRemove = false;
                        break;
                    }
                }

                if (isRemove) {
                    if (!isReadyRemove(temp[i][j])) {
                        temp[i][j] = -1;
                        count++;
                    }

                    for (int k = 0; k < 3; k++) {
                        int nr = i + dx[k];
                        int nc = j + dy[k];
                        if (!isReadyRemove(temp[nr][nc])) {
                            temp[nr][nc] = -1;
                            count++;
                        }
                    }
                }
            }
        }

        block = temp;
        answer += count;
        return count > 0;
    }

    static void move() {
        for (int j = 0; j < col; j++) {
            for (int i = row - 1; i >= 0; i--) {
                if (block[i][j] == -1) {
                    int x = i;

                    while (x > 0 && block[x][j] == -1) {
                        x--;
                    }

                    block[i][j] = block[x][j];
                    block[x][j] = -1;
                }
            }
        }
    }

    static boolean isRange(int a, int b) {
        return a >= 0 && a < row && b >= 0 && b < col;
    }

    static boolean isReadyRemove(int value) {
        return value == -1;
    }

    static int[][] copyDeepToArray(int[][] array) {
        int[][] temp = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                temp[i][j] = array[i][j];
            }
        }
        return temp;
    }
}
