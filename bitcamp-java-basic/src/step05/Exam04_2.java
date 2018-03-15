package step05;

import java.util.Scanner;

public class Exam04_2 {
    
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) 
            System.out.println(i);
            
        // System.out.println(i);  //컴파일 오류!

        System.out.println("--------------------------------");

        int x;
        for (x = 1; x <= 5; x++) 
            System.out.println(x);
        System.out.printf("x = %d", x);
    }
}