// DB 커넥션 객체를 관리하는 역할
// => 빌려주는 역할을 수행한다.
package step25.ex4;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Properties;

public class DefaultDataSource implements DataSource {
    String driver;
    String jdbcUrl;
    String user;
    String password;
    
    ArrayList<Connection> conPool = new ArrayList<>();
    
    public DefaultDataSource() throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("jdbc.properties"));
        this.driver = props.getProperty("jdbc.driver");
        this.jdbcUrl = props.getProperty("jdbc.url");
        this.user = props.getProperty("jdbc.username");
        this.password = props.getProperty("jdbc.password");
    }
    
    public DefaultDataSource(String driver, String jdbcUrl, String user, String password) throws Exception{
        this.driver = driver;
        this.jdbcUrl = jdbcUrl;
        this.user = user;
        this.password = password;
        
        Class.forName(driver);
        // Driver 클래스가 로딩될때 스스로 객체응 자동 생성하여 DriverManager에 등록한다.
        
    }
    public Connection getConnection() throws Exception {
        if (conPool.size() == 0) {
            System.out.println("새 연결 객체를 만든다.");
            return new ConnectionProxy(
                    this,
                    DriverManager.getConnection(jdbcUrl, user, password));
        }
        
        Connection con = conPool.remove(0);
        if (con.isClosed() &&
                !con.isValid(1)) {
            System.out.println("새 연결 객체를 만든다.");
            return new ConnectionProxy(
                    this,
                    DriverManager.getConnection(jdbcUrl, user, password));
        }
        System.out.println("기존 연결 객체를 사용한다.");
        return con;
    }
    
    public void returnConnection(Connection con) {
        conPool.add(con);
    }
}
