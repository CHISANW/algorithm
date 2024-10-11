package BaekJoonAlgorithm.구현;

import java.util.Scanner;

public class 민겸수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        System.out.println(getMax(line));
        System.out.println(getMin(line));
    }

    static String getMax(String line){
        String temp = line;
        StringBuilder sb= new StringBuilder();

        while (!temp.isEmpty()){
            char[] chars = temp.toCharArray();
            int start = 0;
            int last = 1;
            for (int i =1 ;i<chars.length;i++){
                if (chars[start]=='M'){
                    if (chars[i]=='K'){
                        last = i+1;
                        break;
                    }
                }else break;
            }
            String substring = temp.substring(start, last);
            String toInteger = convertStringToInteger(substring);
            sb.append(toInteger);
            temp = temp.substring(last);
        }

        return sb.toString();
    }

    static String getMin(String line){
        String temp = line;
        StringBuilder sb = new StringBuilder();

        while (!temp.isEmpty()) {
            char[] chars = temp.toCharArray();
            int start = 0;
            int last = 1;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == chars[start]) {
                    last = i + 1;
                } else {
                    break;
                }
            }

            String substring = temp.substring(start, last);

            String intValue = convertStringToInteger(substring);
            sb.append(intValue);

            temp = temp.substring(last);
        }

        return sb.toString();
    }

    static String convertStringToInteger(String line){
        StringBuilder sb = new StringBuilder();
        String str = sb.append(line).reverse().toString();
        boolean type = str.length() > 1;

        char[] chars = str.toCharArray();
        sb.setLength(0);

        int count = 1;
        if (type){
            for (char c : chars) {
                if (count>0){
                    if (c == 'M'){
                        sb.append(1);
                    }else
                        sb.append(5);
                    count--;
                }
                else {
                    if (c == 'M'){
                        sb.append(0);
                    }else
                        sb.append(5);
                }
            }
        }else{
            for (char c : chars) {
                if (c== 'M'){
                    sb.append(1);
                }else sb.append(5);
            }
        }

        return sb.toString();
    }

}
