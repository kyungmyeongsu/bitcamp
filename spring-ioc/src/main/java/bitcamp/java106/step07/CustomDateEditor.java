// 프로퍼티 에디터 만들기
package bitcamp.java106.step07;

import java.beans.PropertyEditorSupport;
import java.sql.Date;


public class CustomDateEditor extends PropertyEditorSupport{
    // 이 메서드는 Spring IoC 컨테이너가 String 타입의 프로퍼티 값을 
    // 다른 타입의 값으로 바꾼 때 호출하는 메서드이다.
    
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("CustomDateEditor.setAsText()");
        // 파라미터로 넘어온 String 타입의 프로퍼티 값을 
        // 원하는 타입(java.sql.Date)의 값으로 바꿔 내부에 저장하라!
        // => 그러면 Spring IoC 컨테이너는 이 값을 꺼내서 객체에 주입 할 것이다.
        this.setValue(Date.valueOf(text));
    }
    
    // 언제 어떤 메서득 호출되는지 확인하기위해 상속받은 메서드를 오버라이딩 해보자!
    @Override
    public void setValue(Object value) {
        // 이 메서드는 단지 호출 되었을 때 표시하기위해 오버라이딩 했다.
        System.out.println("CutomDateEditor.setValue()");
        super.setValue(value); // 원래 하던일을 수행한다.
    }
    
    @Override
    public Object getValue() {
        // 이 메서드는 단지 호출 되었을 때 표시하기위해 오버라이딩 했다.
        System.out.println("CutomDateEditor.getValue()");
        return super.getValue(); // 원래 하던 일을 수행한다.
    }
}
