// Stateless와 Stateful 의 비교
package step23.ex5;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// stateful(connectionful) 방식의 장점
// => 클라이언트와 계속 연결을 유지하기 때문에 작업 결과를 계속 서버에 유지 할 수 있다.
//
public class StatefulServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행중...");
        // 합계를 계산하는 서버를 만들어보자!
        ServerSocket ss = new ServerSocket(8888);
        
        while (true) {
            Socket socket = ss.accept();
            System.out.println("클라이언트 연결 승인 및 작업 처리 중...");
            processRequest(socket);
        }
    }
    
    static void processRequest(Socket socket) throws Exception {
        try (
                Socket socket2 = socket;
                PrintStream out = new PrintStream(socket.getOutputStream());
                Scanner in = new Scanner(socket.getInputStream());
                ) {
            // 클라이언트와의 연결을 끊을 때 까지 계속 계산 결과를 서버에 유지한다.
            // => 그래서 "Connection"
            int sum = 0;
            
            while (true) {
                String str = in.nextLine();
                if (str.equals(""))
                    break;
                sum += Integer.parseInt(str);
            }
            
            out.println("결과 = " + sum);
        }
    }
}
