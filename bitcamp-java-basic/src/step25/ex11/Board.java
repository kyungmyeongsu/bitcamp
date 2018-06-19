package step25.ex11;

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
    public Board setNo(int no) {
        this.no = no;
        return this;
    }
    public String getTitle() {
        return title;
    }
    public Board setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getContent() {
        return content;
    }
    public Board setContent(String content) {
        this.content = content;
        return this;
    }
    public Date getRegisteredtDate() {
        return registeredtDate;
    }
    public Board setRegisteredtDate(Date registeredtDate) {
        this.registeredtDate = registeredtDate;
        return this;
    }

    
    
}
