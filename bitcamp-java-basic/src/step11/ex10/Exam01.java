// 메서드 오버로딩(overloading) - 정의하는 규칙과 사용 규칙
package step11.ex10;

public class Exam01 {

    public static void main(String[] args) {
        // 메서드 사용하기
        // 같은 이름의 메서드가 여러개 있을 경우,
        // 메서드를 호출할떄 넘겨주는 값(아규먼트)의 타입과 개수로 
        // 호출할 메서드를 결정한다.
        
        // => 다음은 m() 메서드 중에서 아규먼트를 받지 안는 메서드를 호출한다.
        A.m();
        
        // => 다음은 int 값을 받는 m() 을 호출한다.
        A.m(100);
        
        // => 다음은 String 값을 받는 m()을 호출한다.
        A.m("Hello");
        
        // => 다음은 int 와 String 값을 받는 m()을 호출한다.
        A.m(100, "Hello");
        
        // => 다음은 String과 int 값을 받는 m()을 호출한다.
        A.m("Hello", 100);
        
        // => float 타임의 앖을 받는 m()은 없기 때문에 컴파일 오류!
        //A.m(3.14f);
        
    }
}


