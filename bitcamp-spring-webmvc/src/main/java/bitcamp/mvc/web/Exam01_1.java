// @Contrller와 @RequestMapping
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 페이지 컨트롤러를 가르킬때 이 애노테이션을 붙인다.
@RequestMapping("/exam01_1/m1") // 요총 핸들러와 URL을 열결할 때 이 애노테이션을 붙인다.
public class Exam01_1 {
    
    @RequestMapping // 위에서 지정한  URL 요청을 처리할 메서드를 지정한다.
    @ResponseBody // 클라이언트에게 리턴 값은 클라이언트에게 리턴할 콘텐트임을 지정한다.
    public String m1() {
        return "Exam01_1.m1()";
    }
    
    // 다음과 같이 RequestMapping이 붙은 메소드를 또 정의하면
    // "/exam01/m1" 요청에 대해 어떤 메서드를 호출 할지 결정할 수 없기 떄문에 실행 오류가 발생한다.
    /*
    @RequestMapping 
    @ResponseBody 
    public String m2() {
        return "Exam01_1.m2()";
    }
    */
}
