package step05.assignment;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int count = 1;
        while (count <= len) {
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count++;
        }
        count = len - 1;
        while (count >= 1) {
            int starCnt = 1;
            while (starCnt <= count) {
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count--;
        }

        // int i = 0;
        // int j = 0;
        // while (i < len) {
        //     while (j <= i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        //     j = 0;
        // }
    }
}