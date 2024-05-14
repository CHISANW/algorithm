package programmers.배열;

import java.util.*;

public class 배열정렬하기 {
    public static void main(String[] args){

        int[] arg = {1,-5,2,4,3};

        int[] result =solutions(arg);
        System.out.println(Arrays.toString(result));
    }

    private static int[] solutions(int[] arg) {
        int[] clone =arg.clone();
        Arrays.sort(clone);
        return clone;
    }
}
