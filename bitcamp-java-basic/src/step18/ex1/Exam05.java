// Reflection API : 클래스 로딩과 인스턴스 생성
package step18.ex1;

import java.io.File;

public class Exam05 {
    
    static class A {
        void m() {
            System.out.println("Hello!");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("step18.ex1.Exam05$A");
        
        A obj = (A) clazz.newInstance();
        obj.m();
    }

}
