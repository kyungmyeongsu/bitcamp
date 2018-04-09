// 애노테이션 사용
// => @애노테이션이름(프로퍼티명=값, 프로퍼티명=값...)
package step20.ex1;

@MyAnnotation(value="값") // 클래스 정의 앞에 선언할 수 있다.
public class MyClass {
    
    @MyAnnotation(value="값") // 변수 앞에 선언할 수 있다.
    int i;
    
    @MyAnnotation(value="값") // 메서드 정의 앞에 선언 할 수 있다.
    public void m1(@MyAnnotation(value="값")String p) {
        @MyAnnotation(value="값") int local;
        
        // 일반문장 앞에 선언할 수 없다.
        //@MyAnnotation(value="값") if(true) System.out.println("OK"); //컴파일 오류!
    }
    
}
