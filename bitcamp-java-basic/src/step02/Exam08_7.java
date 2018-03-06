package step02;

public class Exam08_7 {
    public static void main(String[] args) {
        char ch;
        int i = 0x41;
        ch = (char)i;

        boolean bool;
        bool = (boolean)1; //컴파일 오류!

        boolean v1 = (boolean) "true"; //컴파일 오류!
        char v2 = (char) "가"; //컴파일 오류!
        int v3 = (int) "123"; //컴파일 오류!
        float v4 = (float) "3.14f"; //컴파일 오류!
    }
}