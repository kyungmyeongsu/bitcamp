package bitcamp.mvc.web;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

// 모든 컨트롤러에게 조언을 수행하는 클래스 정의
// => 다음 애노테이션을 붙이면 페이지 컨트롤러를 실행 할 때 마다 호출될 것이다.
//    먼저 이 클래스를 살펴볼 것이다.
@ControllerAdvice
public class Exam05_5_GlobalControllerAdvice {
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        System.out.println("Exam05_5_GlobalControllerAdvice()");
        binder.registerCustomEditor(
                java.sql.Date.class,
                new PropertyEditorSupport() {
                    @Override
                    public void setAsText(String text) throws IllegalArgumentException {
                        this.setValue(Date.valueOf(text));
                    }
                });
    }
}
