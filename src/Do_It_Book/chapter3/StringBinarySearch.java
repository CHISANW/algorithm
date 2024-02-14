package Do_It_Book.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] x = {    // 자바에서 사용하는 키워드(알파벳 순)
                "abstract",   "assert",       "boolean",   "break",      "byte",
                "case",       "catch",        "char",      "class",      "const",
                "continue",   "default",      "do",        "double",     "else",
                "enum",       "extends",      "final",     "finally",    "float",
                "for",        "goto",         "if",        "implements", "import",
                "instanceof", "int",          "interface", "long",       "native",
                "new",        "package",      "private",   "protected",  "public",
                "return",     "short",        "static",    "strictfp",   "super",
                "switch",     "synchronized", "this",      "throw",      "throws",
                "transient",  "try",          "void",      "volatile",   "while"
        };

        System.out.print("원하는 키워드를 넣어 주세요.: ");
        String ky = stdIn.next();
        int search = Arrays.binarySearch(x, ky);

        if(search<0)
            System.out.println("찾는 키워드가 없습니다.");
        else
            System.out.println("x["+search+"] 존재");

    }
}
