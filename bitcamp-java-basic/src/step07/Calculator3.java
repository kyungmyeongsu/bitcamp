// 메서드 분류 - 인스턴스 변수 사용
package step07;

public class Calculator3 {
    // 인스탄스 변수
    // => 작업 결과를 개별적으로 관리하고 싶을 때 인스턴스 변수로 선언한다.
    // => 인스턴스 변수는 클래스가 로딩 될떄 만들어지지 않는다.
    // => new 명령을 사용해서 만들어야한다.
    // => 변수 선언 앞에 static이 붙지 않는다. 
    int result = 0;
    
    public static void plus(Calculator3 calc, int value) {
        calc.result += value;
    }
    public static void minus(Calculator3 calc, int value) {
        calc.result -= value;
    }
    public static void multiple(Calculator3 calc, int value) {
        calc.result *= value;
    }
    public static void divide(Calculator3 calc, int value) {
        calc.result /= value;
    }
}
