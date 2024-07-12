package programmers.level_2;

import java.util.Arrays;

public class 행렬테두리회전하기 {
    public static void main(String[] args) {
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        System.out.println(Arrays.toString(solution(6,6, queries)));
    }

    static int[] solution(int rows, int columns, int[][] queries){

        int[][] matrix = new int[rows][columns];
        int[] result = new int[queries.length];

        int index = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = index++;
            }
        }

        for(int i = 0; i<queries.length;i++){
            result[i] = rotate(matrix, queries[i]);
        }
        return result;
    }

    public static int rotate(int[][] matrix, int[] query){
        int x1 = query[0]-1;
        int y1 = query[1]-1;
        int x2 = query[2]-1;
        int y2 = query[3]-1;

        int temp = matrix[x1][y1];
        int min = temp;

        for(int i= x1; i<x2; i++){
            matrix[i][y1] = matrix[i+1][y1];
            min = Math.min(min, matrix[i][y1]);
        }

        for(int i = y1; i< y2;i++){
            matrix[x2][i] = matrix[x2][i+1];
            min = Math.min(min, matrix[x2][i]);
        }

        for(int i = x2; i> x1; i--){
            matrix[i][y2] = matrix[i-1][y2];
            min = Math.min(min,matrix[i][y2]);
        }

        for(int i = y2; i>y1;i--){
            matrix[x1][i] = matrix[x1][i-1];
            min = Math.min(min, matrix[x1][i]);
        }

        matrix[x1][y1+1] = temp;

        return min;
    }
}
