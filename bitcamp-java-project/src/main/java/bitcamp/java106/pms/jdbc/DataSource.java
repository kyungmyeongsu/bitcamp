// DB 커넥션 객체를 관리하는 역할
// => 빌려주는 역할을 수행한다.
package bitcamp.java106.pms.jdbc;

import java.sql.Connection;

public interface DataSource {
    
    public Connection getConnection() throws Exception;
    public void returnConnection(Connection con);
}
