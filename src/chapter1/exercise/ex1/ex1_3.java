package chapter1.exercise.ex1;


////최솟값 구하는 알고리즘 주어진 식 =  static int min3(int a, int b, int c, int d) p.19
public class ex1_3 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        if(d<min) min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(10,4,2,5)= "+min4(10,4,2,5));
        System.out.println("min(1,4,3,2)= "+min4(1,5,3,2));
        System.out.println("min(2,1,3,5)= "+min4(2,1,3,5));
        System.out.println("min(9,4,7,4)= "+min4(9,4,7,4));
    }
}
