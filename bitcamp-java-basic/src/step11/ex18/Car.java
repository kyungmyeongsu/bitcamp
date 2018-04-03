package step11.ex18;

public abstract class Car {

    public Car() {
        super();
    }

    public void start() {
        System.out.println("시동건다!");
    }

    public void shutdown() {
        System.out.println("시동끈다!");
    }

    // 추상 메서드
    // => 서브 클래스에서 재정의할 메석드라면 궅이 수퍼 클래스에서 구현하지 말라!
    // => 또는 서브 클래스가 구현 하도록 강데하고 싶다면 그때 해당 메서드를 추상 메서드로 선언한다.
    // => 추상 메서드를 상속 받는 서브 클래스는 반드시 구현되어야 한다.
    //    만약 구현하지 않으면 서브 클래스도 추상 클래스가 되어야한다.
    // => 왜? 추살 메서드가 있다는 것을 해당 메서드를 살행 할수 없다는 것이고
    public abstract void run();

}