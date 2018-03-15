package step06;

import java.util.Scanner;

public class Exam02_1 {
    static void hello() {
        System.out.println("안녕하세요!");
        System.out.println("이 메서드는 어떤 값도 리턴 하지 않습니다.");
    }
    public static void main(String[] args) {
        hello();

        System.out.println("hello() 실행 완료!");

        // hello(100);  //컴파일 오류!

        int i;
        i = hello();
    }
}