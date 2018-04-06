// IoC 컨테이너 만들기 - 의존 객체의 주입
package step19.ex8;

import java.io.File;
import java.util.List;

public class Exam13 {
    public static void main(String[] args) throws Exception {
        // 새 Engine을 준비한다.
        UltraEngine engine = new UltraEngine();
        
        // Car 클래스는 Engine을 자체적으로 생성하기 때문에
        // 새로 만든 엔진에 꼽을수가 없다.
        Car car = new Car(); // 기존 Engine 객체 사용!
        car.move();
        
        System.out.println("---------------------------");
        
        //
        Car2 car2 = new Car2(engine);
        car2.move();
    }
    
}

// DI는 IoC의 한 예이다.
//
// IoC(Inversion of Control)?
// => 제어의 역행.
// => 일반적인 흐름에서 벗어난 동작을 말한다.
// => 예:
//    1) Dependancy Injection(DI)
//       => 자신이 사용할 의존 객체를 자신이 만들지 않고 외부우세 주입 받는것.
//    2) Event
//       => 실행 순서에 상관없이 특정 사건이 발생하면 지정된 코드가 실행되는 것.
