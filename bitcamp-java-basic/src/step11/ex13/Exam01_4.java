// 캡슐화 - 셋터와 겟터
package step11.ex13;

public class Exam01_4 {

    public static void main(String[] args) {
        // 환자 데이터를 등록해보자!
        Customer4 c1 = new Customer4();
        
        // 실무에서 만드는 셋터는 보통 파라미터 값을 ㄱ검증하지 않기 떄문에
        // 그냥 입력된 값 그대로 인스턴스 변수에 저장 한다.
        // 그래서 값을 꺼내 출력해보면 입력 된 값을 그대로 출력된다.
        c1.setName("홍길동");
        c1.setAge(300);
        c1.setWeight(100);
        c1.setHeight(-50);
        // 셋터 메서드에서 유효한 값이 아니면 필터링 하여 처리할 것이다.
        
        // 값을 꺼내보자!
        // => 인스턴스 변수에 직접 접근할수 없기 떄문에 메서드를 통해 값을 꺼내야한다.
        
        System.out.printf("%s, %d, %d, %d\n", 
                c1.getName(), c1.getAge(), c1.getWeight(), c1.getHeight());
        
        // Customer2에서는 인스턴스 변수의 접근을 private으로 막았기 떄문에
        // 다른 클래스는 해당 인스턴스 변수에 접근할 수 없다.
        // 해결책?
        // => 이 클래스에서 제공하는 메서드를 사용하라!
        // => Exam01_3.java를 확인하라!
    }

}
