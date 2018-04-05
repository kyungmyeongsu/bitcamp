// 메서드 : main() 메서드 - 프로그램 아규먼트
package step06;

import java.util.Scanner;

public class Exam05_2 {
    
    // 프로그램 아규먼트
    // - jvm을 실행할 때 프로그램에 전달하는 값
    // - 예)
    // > java -cp bin Exam05_2 aaa bbb cccc
    // aaa bbb cccc 가 프로그램 아규먼트이다.
    //
    public static void main(String[] args) {
        
        for (String value : args) {
            System.out.printf("[%s]\n", value);
        }
    }
}