package programmers.Re_Level_2;

public class 방문길이 {
    //[0] = 아래, [1] = 오른쪽, [2] = 위, [3] = 왼쪽,
    static int[] dr = {-1,0,1,0};
    static int[] dc = {0,1,0,-1};
    static boolean[][] visited;
    static int r,c;
    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));  // 7
        System.out.println(solution("LULLLLLLU"));  // 7
    }

    public static int solution(String dirs) {
        visited = new boolean[11][11];
        r = 5;
        c = 5;
        visited[r][c] = true;

        int count = 1;
        String[] arr = dirs.split("");
        for (String s : arr) {
            if(s.equals("U")){
                int nr = r + dr[2];
                int nc = c + dc[2];
                if(isNext(nr,nc) && !visited[nr][nc]){
                    r = nr;
                    c = nc;
                    count++;
                    visited[nr][nc] = true;
                }
            }else if(s.equals("D")){
                int nr = r + dr[0];
                int nc = c + dc[0];
                if(isNext(nr,nc) && !visited[nr][nc]){
                    r = nr;
                    c = nc;
                    count++;
                    visited[nr][nc] = true;
                }

            }else if (s.equals("L")){
                int nr = r + dr[3];
                int nc = c + dc[3];
                if(isNext(nr,nc) && !visited[nr][nc]){
                    r = nr;
                    c = nc;
                    count++;
                    visited[nr][nc] = true;
                }
            }
            else {
                int nr = r + dr[1];
                int nc = c + dc[1];
                if(isNext(nr,nc) && !visited[nr][nc]){
                    r = nr;
                    c = nc;
                    count++;
                    visited[nr][nc] = true;
                }

            }
        }
        return count;
    }

    static boolean isNext(int row, int col){
        return row >= 1 && row < 11 && col >= 1 && col < 11;
    }
}
