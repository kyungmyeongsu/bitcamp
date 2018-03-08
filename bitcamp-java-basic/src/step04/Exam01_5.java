package step04;

public class Exam01_5 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4;
        float f = 5.5f;
        double d = 6.6;
        char c = 7;

        // byte + byte = int
        // byte r1 = b + b;  //컴파일 오류!

        // short + short = int
        // short r2 = s + s;  //컴파일 오류!

        // byte + short = int
        // short r3 = b + s;  //컴파일 오류!

        // byte + int = int
        int r4 = b + i;  //OK!

        // short + int = int
        int r5 = s + i;

        // int + long = long
        // int r6 = i + l;  //컴파일 오류!

        // long + float = float
        // long r7 = l + f;  //컴파일 오류!

        // int + float = float;
        // int r8 = i + f;  //컴파일 오류!

        // float + double = double
        // float r9 = f + d;  //컴파일 오류!

        // byte + short + int + long + float + double =double;
        // long r10 = b + s + i + l + f + d;  //컴파일 오류!

        // float + int + long = float
        // long r11 = f + i + l;  //컴파일 오류!
    }
}