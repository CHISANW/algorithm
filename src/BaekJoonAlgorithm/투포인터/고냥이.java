package BaekJoonAlgorithm.투포인터;

import java.util.Scanner;

public class 고냥이 {
    //시간 복잡도를 줄이기위해서 스택 메소들통해 구현
    static int[] alpaBetFreqeuncy = new int[26];
    // 연속된 문자의 카운트
    static int count = 0;
    
    static void increaseAalpa(char alpa){           //알파벳을 증가시키는 메서드
        if (alpaBetFreqeuncy[alpa-'a']++ ==0)       //만약 알파벳이 0이라면 count 증가
            count++;
    }

    static void decreaseAalpa(char alpa){           // 알파벳 배열을 감소시키는 메소드
        if (--alpaBetFreqeuncy[alpa-'a']==0)        // 만약 알파벳을 전위 감소를 시켜서 0이나온다면 count--를한다.
            count--;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();

        char[] gonang = stdIn.next().toCharArray();
        int L = gonang.length;      // 배열의 길이


        int ans = 0;            //정답
        int nextIndex = 0;      // 투포인터를 사용하는 j

        for (int i =0;i<L;i++){
            while (nextIndex<L){        //j가 L이 범위까지 반복
                increaseAalpa(gonang[nextIndex++]);     //알파벳을 증가시캬보고
                if (count>N){       //알파벳 카운트가 N보다 클때
                    decreaseAalpa(gonang[--nextIndex]);     //사용할수 없는 문자열이라서 올렸던 알파벳 배열을 원복
                    break;                                  // 사용할수 없는 문자열이기때문에 해당 반복을 break;
                }
            }
            ans = Math.max(ans,nextIndex-i);                // 정답을 연산
            decreaseAalpa(gonang[i]);                       // for문이기때문에 다음 i 포인터에 대한수행을 위해 i에대한 알파벳 배열을 감소 시켜야 i+1 에 대한 계산이 올바르게 동작 할 수 있다.
        }
        System.out.println(ans);        //정답 출력
    }
}
