package step05.assignment;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

        int i = 1;
        while (i <= len) {
            int a = 1;
            while (a <= i) {
                System.out.print("*");
                a++;
            }
            System.out.println();
            i++;
        }
        i = len - 1;
        while (i >= 1) {
            int a = 1;
            while (a <= i) {
                System.out.print("*");
                a++;
            }
            System.out.println();
            i--;
        }



        // int starLen = 1;
        // while (starLen <= len) {
        //     int spaceCnt = 1;
        //     int spaceLen = (len - starLen) / 2;
        //     while (spaceCnt <= spaceLen) {
        //         System.out.print(" ");
        //         spaceCnt++;
        //     }

        //     int starCnt = 1;
        //     while (starCnt <= starLen) {
        //         System.out.print("*");
        //         starCnt++;
        //     }
        //     System.out.println();
        //     starLen += 2;
        // }

        

       
    }
}