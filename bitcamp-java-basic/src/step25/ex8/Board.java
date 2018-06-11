package step25.ex8;

import java.io.Serializable;
import java.sql.Date;

public class Board implements Serializable {
    private static final long serialVersionUID = 1L;
    
    int no;
    String title;
    String content;
    Date registeredtDate;
    
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", registeredtDate=" + registeredtDate
                + "]";
    }
    
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
