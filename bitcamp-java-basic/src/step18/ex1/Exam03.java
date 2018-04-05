// Reflection API : 클래스 로딩과 "class"라는 스태틱 변수
package step18.ex1;

import java.io.File;

public class Exam03 {

    static class A {
        static int s_var = 100;
        int i_var = 200;
        static void m() {}
        void i_m() {}
        
        static {
            System.out.println("A 클래스 로딩!");
        }
    }
    public static void main(String[] args) throws Exception {
        Class clazz = A.class;
        // 자바의 모든 클래스는 "class"라는 특별한 스태틱 변수를 갖고 있다.
        // "class" 변수는 해당 클래스의 정보를 담은 class 객체의 주소가 저장되어있다.
        // 즉 다음 코드와 같은 값을 리턴한다.
        // Class clazz = Class.forName("step18.ex1.Exam02$A");
        //
        // 하지만 이 방식으로 로딩하면  static {}블록을 실행하지 않는다.
        // 물론 스태틱 멤버를 사용하는 최초의 순간에는 static 블록이 실행될 것이기 때문에
        // "클래스 로딩 후 스태틱 블록 실행" 명제는 지켜진다.
        
        Class clazz2 = String.class;
        Class clazz3 = System.class;
        Class clazz4 = File.class;
    }

}
