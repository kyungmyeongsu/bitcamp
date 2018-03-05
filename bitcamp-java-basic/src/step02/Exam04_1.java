package step02;

public class Exam04_1 {
    public static void main(String[] args) {
        
        byte b;
        b = -128;
        b = 127;

        b = -129;
        b = 128;

        short s;
        s = -32768;
        s = 32767;

        s = -32769;
        s = 32768;

        int i;
        i = -2147483648;
        i = 2147483647;

        // i = -2147483649;
        // i = 2147483648;

        i = -2147483649L;
        i = 2147483648L;

        long l;
        l = -9223372036854775808L;
        l = 9223372036854775807L;
        
        byte b2;
        b2 = 100;
        b2 = 100L;
    }
}