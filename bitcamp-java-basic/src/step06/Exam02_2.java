package step06;

import java.util.Scanner;

public class Exam02_2 {
    static void hello(String name, int age) {
        System.out.printf("%d살 %s님 반갑습니다.\n", age, name);
    }
    public static void main(String[] args) {
        hello("홍길동", 20);

        System.out.println("main()222222");

        hello("임꺽정", 30);

        System.out.println("main()333333");

        hello("유관순", 16);

        System.out.println("main()444444");

        // hello("윤봉길"); // 컴파일 오류!

        // hello(20, "윤봉길");  //컴파일 오류!

        // String r = hello("안중근", 30); // 컴피일 오류!
        // void r = hello("안중근", 30);  // 컴파일 오류!
    }
}