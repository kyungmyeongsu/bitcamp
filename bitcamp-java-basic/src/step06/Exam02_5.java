package step06;

import java.util.Scanner;

public class Exam02_5 {
    static void hello(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }
    public static void main(String[] args) {
        hello();

        System.out.println("----------------------");

        hello("홍길동");

        System.out.println("----------------------");

        hello("홍길동", "임꺽정", "유관순");

        System.out.println("----------------------");

        String[] arr = {"김구", "안중근", "윤봉길", "유관순"};
        hello(arr);
        System.out.println("----------------------");
        
        // hello("홍길동", 20, "오호라");  //컴파일 오류!
    }
}