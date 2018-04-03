package step11.ex17;

// 추상클래스
// => 서브클래스에게 공통 기능을 상속해주는 목적으로 만든 클래스이다.
// => 직접 사용하지 않는 클래스이다.
// => 즉 개발자에세 이 클래스를 상속 받아서 클
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

    public void run() {
        System.out.println("달린다.");
    }

}