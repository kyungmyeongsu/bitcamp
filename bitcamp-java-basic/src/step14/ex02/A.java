//인터페이스 정의
package step14.ex02;

public interface A {
 
     // 인터페이스에 정의하는 메서드는 호출 규칙이다.
     // 규칙은 공개 되어야 한다.
     // 그래서 인터페이스에 선언 되는 모든 메서드는 public 이다.
     public void m1();
     
     // => 무조건 public 이기 때문에 생략해도 public이다.
     void m2();
     
     // private, protected, (default)는 없다.
     //private void m3();
     //protected void m4();
     void m5(); // 이건 (default) 아니라,public 이생략 된것이다.
}
