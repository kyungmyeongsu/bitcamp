// 로그인 폼 출력과 사용자 인증 처리 서블릿
package bitcamp.java106.pms.servlet.auth;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

@SuppressWarnings("serial")
@WebServlet("/auth/login")
public class LoginServlet extends HttpServlet {
    
    MemberDao memberDao;
    
    @Override
    public void init() throws ServletException {
        ApplicationContext iocContainer =
                WebApplicationContextUtils.getWebApplicationContext(
                        this.getServletContext());
        memberDao = iocContainer.getBean(MemberDao.class);
    }
    
    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        
        Cookie cookie = null;
        if (request.getParameter("saveId") != null) {
        
        // 입력 폼에서 로그인 할 깨 사용한 ID를 자동으로 출력할 수 있도록
        // 웹브라우저로 보내 저장한다.
        cookie = new Cookie("id", id);
        cookie.setMaxAge(60 * 6 * 24 *7);
        } else {
            cookie = new Cookie("id", "");
            cookie.setMaxAge(0); // 웹브라우저에 "id"라는 이름으로 저장된 쿠키가 있다면 제거한다.
            // 즉 유효기간을 0으로 설정함으로써 "id"라는 이름의 쿠키를 무효화시키는 것이다.
        }
        response.addCookie(cookie);
        
        try {
            Member member = memberDao.selectOneWithPassword(id, password);
            
            HttpSession session = request.getSession();
            
            if (member != null) { //로그인 성공
                session.setAttribute("loginUser", member);
                
                // 로그인 하기전의 페이지로 이동한다.
                String refererUrl = (String)session.getAttribute("refererUrl");
                if (refererUrl == null) { //이전 페이지가 없다면 메인화면으로 이동 시킨다.
                    response.sendRedirect(request.getContextPath()); // => "/bitcamp-java-project"
                } else {
                    // 이전 페이지가 있다면 그 페이지로 이동한다.
                    response.sendRedirect(refererUrl);
                }
                return;
                
            } else {
                session.invalidate();
                response.setContentType("text/html;charset=UTF-8");
                request.getRequestDispatcher("/auth/fail.jsp").include(request, response);
            }
        } catch (Exception e) {
            RequestDispatcher 요청배달자 = request.getRequestDispatcher("/error");
            request.setAttribute("error", e);
            request.setAttribute("title", "로그인 실패!");
            요청배달자.forward(request, response);
        }
    }
}


// 웹브라우저                                                                              웹서버
// GET 요청: /bitcamp-java-project/auth/login ===>
//                                            <=== 응답: 로그인폼