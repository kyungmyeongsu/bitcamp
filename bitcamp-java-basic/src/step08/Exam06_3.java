// 초기화 블록 - 초기화 순서
package step08;

public class Exam06_3 {
    static class A {
        
        A() {
            a = 300;
        }
        
        {
            a = 200;
        }
        
        int a = 100;
    }
    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.a);
    }
}
