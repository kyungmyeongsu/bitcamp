// 서브 인터페이스 구현 - 수퍼 인터페이스의 메서드까지 모두 구현해야한다.
package step14.ex3;

public class Exam01 implements B{
    public void m1() {} // B 인터페이스 뿐만아니라 ,
    public void m2() {} // B의 수퍼 인터페이스의 메서드까지 구현해야한다.
}
