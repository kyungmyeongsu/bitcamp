// 인터페이스의 모든 메서드는 public이기 때문에
// 인터페이스를 수현하는 클래스는
// 메서드의 공개 범위를 public 보다 적게 공개할 순 없다.
package step14.ex02;

public class Exam02 implements A3{
    //public 보다 좁게 공개 범위를 줄일 수 없다.
    //private void m1() {} // 컴파일 오류!
    //protected void m1() {} // 컴파일 오류!
    //void m1() {} // 컴파일 오류!
    
    // 반드시 public이어야한다.
    public void m1() {}
    public void m2() {}
}
