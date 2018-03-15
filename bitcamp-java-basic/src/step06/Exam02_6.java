package step06;

import java.util.Scanner;

public class Exam02_6 {
    //가변 파라미터
    static void hello(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%s님 반갑습니다.\n", names[i]);
        }
    }

    //배열 파라미터
    static void hello2(String[] names) {
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

        hello2("홍길동", "임꺽정", "유관순");

        System.out.println("----------------------");

        String[] arr2 = {"김구", "안중근", "윤봉길", "유관순"};
        hello2(arr2);
        System.out.println("----------------------");
        
        // hello("홍길동", 20, "오호라");  //컴파일 오류!
    }
}