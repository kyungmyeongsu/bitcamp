package step05;

public class Exam01_3 {
    public static void main(String[] args) {
        if (true) System.out.println("1111");
        if (false) System.out.println("2222");
        if (10 < 8 + 5) System.out.println("3333");

        // if (1) System.out.println("4444");  //컴파일 오류!
        // if (3.14f) System.out.println("4444");  //컴파일 오류!
        // if (0b0110 & 0b0011) System.out.println("4444");  //컴파일 오류!
        
        int a = 100;
        if (a == 100) System.out.println("5555");

        // if (a = 100) System.out.println("5555");  //컴파일 오류!
    }
}