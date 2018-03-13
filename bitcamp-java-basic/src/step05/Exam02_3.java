package step05;

import java.util.Scanner;

public class Exam02_3 {
    public static void main(String[] args) {
        byte b = 20;
        switch (b) {
        case 1:
        case 2:
        default:
        }

        short s = 20;
        switch (s) {
        case 1:
        case 2:
        default:
        }

        int i = 20;
        switch (i) {
        case 1:
        case 2:
        default:
        }

        // 컴파일 오류!
        /*
        long l = 20;
        switch (l) {
        case 1:
        case 2:
        default:
        }
        */

        char c = 'A';
        switch (c) {
        case 'A':
        case 66:
        case 0x43:
        default:
        }

        String str = "hello";
        switch (str) {
        case "hello":
        case "ohora":
        case "hul":
        default:
        }

        /*
        boolean bool = true;
        switch (bool) {
        case true:
        case false:
        }
        */

        int x = 1, y = 300;
        switch (x) {
        case 1 * 300:  //OK
        // case 1 * y:  //컴파일 오류!
        }
    }
}