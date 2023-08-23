package chapter1.exercise.ex1;


//최댓 값 구하는 알고리즘 주어진 식  = static int max4(int a, int b, int c, int d) p.19
public class ex1_1 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max(1,2,3,4)= "+max4(1,2,3,4));
        System.out.println("max(2,2,5,4)= "+max4(2,2,5,4));
        System.out.println("max(1,9,6,1)= "+max4(1,9,6,1));

    }
}
