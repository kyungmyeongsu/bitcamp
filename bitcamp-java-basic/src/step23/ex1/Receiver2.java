// 상대편으로 부터 연결 요청 받기 - 서버 (server)
package step23.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver2 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        String str = in.nextLine();
        System.out.println(str);
        
        System.out.print("입력> ");
        str = keyScan.nextLine();
        out.println(str);
        
        in.close();
        out.close();
        
        socket.close();
        serverSocket.close();
        keyScan.close();
    }
}