// 애노테이션 프로퍼티 타입
package step20.ex6;

// @MyAnnotation은 메서드와 타입에만 붙일수 있다.
@MyAnnotation()
public class MyClass {
    @MyAnnotation int i; // 컴파일 오류!
    
    @MyAnnotation public void m() {}
}
