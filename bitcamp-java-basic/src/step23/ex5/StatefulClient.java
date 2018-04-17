// Stateless와 Stateful 의 비교
package step23.ex5;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// stateful(connectionful) 방식의 장점
// => 클라이언트와 계속 연결을 유지하기 때문에 작업 결과를 계속 서버에 유지 할 수 있다.
//
public class StatefulClient {
    public static void main(String[] args) throws Exception {
        // 합계 계산을 요청하는 클라이언트를 만들어보자!
        try (
            Scanner keyScan = new Scanner(System.in);
            
                ) {
        
            while (true) {
                System.out.print("값? ");
                String str = keyScan.nextLine(); // 키보드에서 값을 입력 받아
                
                try (
                    Socket socket = new Socket("localhost", 8888);
                    PrintStream out = new PrintStream(socket.getOutputStream());
                    Scanner in = new Scanner(socket.getInputStream());
                            ) {
                    out.println(str); // 서버로 보낸다.
                    if (str.equals("")) {
                        System.out.println(in.nextLine());
                        break;
                    }
                }
            }
        }
    }
    
}
