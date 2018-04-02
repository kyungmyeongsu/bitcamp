// 다중 인터페이스 구현
package step14.ex3;

public class Exam02 implements B, C {
    public void m1() {} // B 인터페이스 뿐만아니라 ,
    public void m2() {} // B의 수퍼 인터페이스의 메서드까지 구현해야한다.
    public void m3() {} // C의 인터페이스 구현
}
