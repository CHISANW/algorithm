package BaekJoonAlgorithm.리스트;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class 에디터 {
    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        String str = stdIn.next();

        LinkedList<Character> list = new LinkedList<>();

        for (char alpha : str.toCharArray()){
            list.add(alpha);
        }

        ListIterator<Character> listIterator = list.listIterator(list.size());      // 이터레이터를 사용해 LinkedList의 시간복잡도를 O(M)으로 만들어서 사용가능하다. 하지만 ArrayList는 사용할수 없음
        int N = stdIn.nextInt();

        while (N-->0){
            char cursor = stdIn.next().charAt(0);

            if (cursor=='L'){
                if (listIterator.hasPrevious())
                    listIterator.previous();
            }
            else if (cursor=='D'){
                if (listIterator.hasNext())
                    listIterator.next();
            }
            else if (cursor=='B'){
                if (listIterator.hasPrevious()){
                    listIterator.previous();        // 상태를 이전 커서로 옮긴후에
                    listIterator.remove();          //해당 값을 삭제한다.
                }
            }
            else if (cursor=='P'){
                listIterator.add(stdIn.next().charAt(0));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ans : list){
            sb.append(ans);
        }

        System.out.println(sb);
    }
}
