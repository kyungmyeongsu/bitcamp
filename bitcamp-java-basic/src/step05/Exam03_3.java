package step05;

import java.util.Scanner;

public class Exam03_3 {
    
    public static void main(String[] args) {
        int x = 2, y = 1;
        
        // 5 * 5 까지만 출력한다.
        myloop: 
        while (x <= 9) {
            while (y <= 9) {
                System.out.printf("%d * %d = %d\n", x, y, x * y);

                if (x == 5 && y == 5)
                    // break;
                    break myloop;

                y++;
            }
            System.out.println();
            x++;
            y = 1;
        }
    }
}