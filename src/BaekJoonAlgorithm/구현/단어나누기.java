package BaekJoonAlgorithm.구현;

import java.util.*;

public class 단어나누기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        List<String> list = new ArrayList<>();
        for (int i =1; i<line.length()-2;i++){
            String first = line.substring(0,i);

            for (int j =line.length()-1;j>i;j--){
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2= new StringBuilder();
                StringBuilder sb3 = new StringBuilder();
                String second = line.substring(i,j);
                String three = line.substring(j,line.length());
                String a = sb1.append(first).reverse().toString();
                String b = sb2.append(second).reverse().toString();
                String c = sb3.append(three).reverse().toString();
                list.add(a+b+c);
            }

            Collections.sort(list);
        }
        System.out.println(list.get(0));
    }
}
