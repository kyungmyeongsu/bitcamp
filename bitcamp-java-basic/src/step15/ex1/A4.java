// 추상 클래스와 추상 메서드  II
package step15.ex1;

public abstract class A4 {
    // 추상 클래스의 용도는 서브 클래스들이 가져야할 공통 변수나 메서드를 제공하는 것이다.
    // 그래서 일반 변수나 메서드를 정의 할 수 있다.
    public static int value1;
    private int value2;
    
    static void m0() {}
    public void m1() {}
    public void m2() {}
    
    // 추상 클래스는 추상 메서드도 가질 수있다.
    // 의미?
    // => 서브 클래스마나다 구현이 다를 경우 굳이 수퍼 클래스에서 정의할 필요가 없기 때문에
    //    완전히 정의하지 않은 추상 메서드러 남겨 둔다.
    // => 서브클래스 에게 메서드 구현을 강제라고 싶을 떄도 추상 메서드를 활용한다.
    //    추상 메서드를 상속 받은 서브 클래스는 반드시 덜릐 하기 때문이다.
    //    서브 클래스가 상속 추상 메서드를 수현하디 않는다면
    //    추상 메서드를 그냥 보유하기 때문이 일반 클래스로 사용할 수 없다.
    //    즉 추상 클래스가 되어야한다.
    public abstract void m3();
    
}
