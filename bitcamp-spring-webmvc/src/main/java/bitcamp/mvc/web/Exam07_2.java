// 메트릭스 변수 - URL에서 값을 추출하기
package bitcamp.mvc.web;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;

@Controller 
@RequestMapping("/exam07_2") 
public class Exam07_2 {
    
    @GetMapping(value="m1", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m1(String name, int age) {
        return String.format("m1(): name=%s, age=%d", name, age);
    }
    
    @GetMapping(value="m2/{value}", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m2(
            @PathVariable String value,
            @MatrixVariable String name,
            @MatrixVariable int age,
            @MatrixVariable String tel) {
        // 예) 클라이언트에서 URL에 다음과 같은 형식으로 데이터를 보낼 때,
        //      .../exam07_2/m2;name=bbb;age=30;tel=1111-2222
        //    => value="name=bbb;age=30;tel=1111-2222"
        //    => name = "aaa"
        //    => age = 20
        //    => tel = "1111-2222"
        return String.format("m2(): %s, %s, %d, %s", value, name, age, tel);
    }
    
    // ServletContext 얻기
    @Autowired ServletContext servletContext;
    
    // 프론트 컨트롤러에세 ApplicationContext 얻기
    @Autowired ApplicationContext appCtx;
    
    @GetMapping(value="test", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String test() {
        StringBuffer buf = new StringBuffer();
        
        // 1) ContextLoaderListener가 관리하는 Spring IoC 컨테이너 얻기
        ApplicationContext rootCtx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        String[] names = rootCtx.getBeanDefinitionNames();
        for (String name : names) {
            buf.append(rootCtx.getBean(name).getClass().getName() + "\n");
        }
        buf.append("----------------------------\n");
        // 2) 프론트 컨트롤러(DispatcherServlet)가 관리하는 Spring IoC 컨테이너 얻기
        names = appCtx.getBeanDefinitionNames();
        for (String name : names) {
            buf.append(appCtx.getBean(name).getClass().getName() + "\n");
        }
        return buf.toString();
    }
    
    @GetMapping(value="m3/{team}/{task}", produces="text/plain;charset=UTF-8")  
    @ResponseBody
    public String m3(
            @MatrixVariable(name="name", pathVar="team") String name1,
            @MatrixVariable(name="name", pathVar="task") String name2) {
        // 예) 클라이언트에서 URL에 다음과 같은 형식으로 데이터를 보낼 때,
        //      .../exam07_2/m3;name=teamA;qty=3/name=task100;state=1
        return String.format("m3(): 팀명=%s, 작업명=%s", name1, name2);
    }
}







