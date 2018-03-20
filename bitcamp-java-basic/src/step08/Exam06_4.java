// 초기화 블록 - 클래스 블록 = 스태틱 블록
package step08;

public class Exam06_4 {
    static class A {
        static int a;
        static void m() {}
        
        static {
            System.out.println("Static{} 111111111111");
        }
        
        static {
            System.out.println("Static{} 222222222222");
        }
    }
    public static void main(String[] args) throws Exception{
        
        A obj1;
        A obj2;
        
        //A.a = 100;
        System.out.println("--------------");
        
        //A.m();
        System.out.println("**************");
        
        new A();
        
        System.out.println("==============");
        
        Class.forName("step08.Exam06_4$A");
    }
}
