package step06;

import java.util.Scanner;

public class Exam02_3 {
    static String hello() {
        return "안녕하세요!";
    }
    public static void main(String[] args) {
        
        String r = hello();
        System.out.println(r);

        hello();

        // int r2 = hello();  //컴파일 오류!
    }
}