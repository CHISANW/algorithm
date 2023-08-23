package chapter1.exercise.ex1;


//최솟값 구하는 알고리즘 주어진 식 =  static int min3(int a, int b, int c) p.19
public class ex1_2 {
    static int min3(int a, int b, int c){
        int min = a;
        if(b<min) min = b;
        if(c<min) min = c;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min(10,4,2)= "+min3(10,4,2));
        System.out.println("min(1,4,3)= "+min3(1,5,3));
        System.out.println("min(2,1,3)= "+min3(2,1,3));
        System.out.println("min(9,4,7)= "+min3(9,4,7));
    }
}
