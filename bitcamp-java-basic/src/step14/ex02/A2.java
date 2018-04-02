//인터페이스 정의
package step14.ex02;

public interface A2 {
    
    //public void m1() {} //컴파일 오류!
    
    //몸체를 구현하지 않아야 하기 때문에 추상 메서드로 선언한다.
    void m2();
    
    //=> 보통 몸체를 구현하지 않는 메서드는 abstract로 선언한다.
    abstract void m3();
    
    // => 인테피이스의 모든 메서드는 기본적으로 몸체를 구현하디 않기 때문에
    //    abstract를 생략해도 된다.
    void m4();
}
