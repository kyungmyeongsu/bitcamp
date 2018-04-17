// HTTP 클라이언트 만들기
package step23.ex7;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

// HTTP 요청 프로토콜
// ------------------------------
// GET [자원주소] HTTP/1.1 (CRLF)
// Host: [서버주소]
//
// HTTP 프로토콜
// 프로토콜(protocol)
// => 클라이언트/서버 간의 통신 규칙.
// => 데이터를 주고 받는 규칙.
public class HttpClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("www.cine21.com", 80);
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        out.println("GET /news/view/?mag_id=89891&utm_source=dable HTTP/1.1");
        out.println("Host: www.cine21.com");
        out.println();
        
        while (true) {
            try {
                System.out.println(in.nextLine());
            } catch (Exception e) {
                break;
            }
        }
        out.close();
        in.close();
        socket.close();
    }
    
}
