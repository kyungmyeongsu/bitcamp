package step06;

import java.util.Scanner;

public class Exam02_7 {


    // static void m1(String... names, String... names2) {}  //컴파일 오류!
    // static void m1(String... names, int a, String... names2) {}  //컴파일 오류!
    // static void m2(String... names, String a) {}  //컴파일 오류!
    // static void m2(String... names, int a) {}  //컴파일 오류!
    static void m2(int a, String... names) {}  //OK!

    static void x1(String[] names, String[] names2) {
    }

    static void x2(String[] names, int a) {
    }
    public static void main(String[] args) {

        
    }
}