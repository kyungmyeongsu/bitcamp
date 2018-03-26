// 오버라이딩(overriding) - @Override
package step11.ex11;

public class Exam05 {

    public static void main(String[] args) {
        B3 obj = new B3();

        obj.m(100);
        
        // B3 클래스에서는 m() 메서드를 제대로 오버라이딩 하였다.
        // @Override ?
        // => 애노테이션 문법이다.
        // => 컴파일러나 JVM에서 전달하는 특별한 주석이다.
        // => 개발자도 
        
    }

}


// 오버라이딩(overriding)?
// => 부모로부터 상속받은 메서드 중에서 자신(서브클래스)의 역할에 맞지 않는 메서드가 있다면,
//    자신(서브클래스)의 역할에 맞춰 상속받은 메서드를 재정의하여 
//    프로그래밍의 일관성을 확보하는 문법이다.


