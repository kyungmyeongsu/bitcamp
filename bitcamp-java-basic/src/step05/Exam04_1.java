package step05;

import java.util.Scanner;

public class Exam04_1 {
    
    public static void main(String[] args) {
        // for (변수선언 및 초기화; 조건; 증감문) 문장;
        // for (변수선언 및 초기화; 조건; 증감문) {문장1; 문장2; ...}

        for (int i = 0; i <= 5; i++) 
            System.out.println(i);

        System.out.println("--------------------------------");
        for (int i = 0; i <= 5; ) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------");
        int i = 0;
        for (; i <= 5; ) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------");
        i = 1;
        for (;;) {
            if (i >5)
                break;
            System.out.println(i);
            i++;
        }
    }
}