package step11.ex05;

public class Exam01 {
    public static void main(String[] args) {
        
        
        // B 클래스의 설계도이 따라 Heap 여역에 변수를 준비한다.
        // => B 클래스는 A 클래스도 사용한다고 선언했기 때문에
        //    A 클래스의 설계도에 따라 A클래스에 선언된 인스턴스 변수도 함께 생성된다
        
         B obj2 = new B();
         obj2.v2 = 200;
         obj2.v1 = 100;
         System.out.printf("v2=%d, v1=%d\n", obj2.v2, obj2.v1);
         
         // 인스턴스 생성 절차
         //
    }
}
