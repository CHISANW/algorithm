package programmers.level_2;

public class 숫자카드나누기 {
    public static void main(String[] args) {
        int[] arrayA = {10,17};
        int[] arrayB = {5,20};
        System.out.println(solution(arrayA,arrayB));

        int[] arrayA1 = {10,20};
        int[] arrayB1 = {5,17};
        System.out.println(solution(arrayA1,arrayB1));

        int[] arrayA2 = {14,35,119};
        int[] arrayB2 = {18,30,102};
        System.out.println(solution(arrayA2,arrayB2));
    }

    static int solution (int[] arrayA, int[] arrayB){
        int result =0;

        int gcdA = findGcd(arrayA);

        int gcdB = findGcd(arrayB);

        if(divAll(gcdA , arrayB)){
            result = Math.max(result,gcdA);
        }
        if(divAll(gcdB, arrayA)){
            result = Math.max(gcdB,result);
        }

        return result;
    }


    static int gcd(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a% b;
            a = temp;
        }
        return a;
    }

    static int findGcd(int[] array){
        int result = array[0];
        for(int num : array){
            result = gcd(result, num);
            if (result == 1){
                return 1;
            }
        }
        return result;
    }

    static boolean divAll(int gcd, int[] array){
        for(int num : array){
            if(num % gcd == 0){
                return false;
            }
        }
        return true;
    }

}
