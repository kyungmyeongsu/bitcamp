// @RequestMapping - HTTP 헤더로 메서드 구분하기
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping("/exam04_2") 
public class Exam04_3 {
    
    // HTTP 요청에서 Accept 헤더의 값에 따라 호출될 메서드를 구분하기
    // 테스트 방법: 
    // 예1) exam04_2.html 
    @GetMapping(value="get", consumes="text/plain")  
    @ResponseBody  
    public String m1() {
        return "Exam04_3.m1()";
    }
    
    @GetMapping(value="get", consumes="text")  
    @ResponseBody  
    public String m2() {
        return "Exam04_3.m2()";
    }
    
    @GetMapping(value="get", headers= {"name","age"})  
    @ResponseBody  
    public String m3() {
        return "Exam04_3.m3()";
    }
}







