// DAO와 서비스 객체사이에서 데이터를 실어 나르는 용도로 사용된다.
// => DTO(Data Transfer Object)라 부른다.
// => "도메인 객체"라고도 부른다.
package step25.ex3;

import java.io.Serializable;
import java.sql.Date;

// 외부 저장소로 객체를 내보낼수 있도록 serial 기능을 활성화 시킨다. 
public class Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    // DB 테이블의 컬럼값을 저장할 인스턴스 변수를 준비한다.
    // => 보통 컬럼이름은 DB관례에 따라 약제로 기술한다.
    // => 그러나 자바에서는 자바의 관례에 따라 변수 명을 만들라!
    //    DB 컬럼명과 같게 하지말라!
    int no;
    String title;
    String content;
    Date registeredtDate;
    
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", registeredtDate=" + registeredtDate
                + "]";
    }
    
    // 셋터와 겟터 생성
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegisteredtDate() {
        return registeredtDate;
    }
    public void setRegisteredtDate(Date registeredtDate) {
        this.registeredtDate = registeredtDate;
    }

    
    
}
