package step05;

import java.util.Scanner;

public class Exam03_2 {
    
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        while (count < 100) {
            count++;
            sum += count;
        }

        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------------");

        //countinue 사용전
        // 1부터 100 까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count % 2 == 0) {
                sum += count;
            } 

            
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------------");

        //countinue 사용 후
        // 1부터 100 까지의 짝수의 합은?
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count % 2 == 1) 
                continue;
            sum += count;
            
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------------");

        //break 사용전
        // 1부터 100 까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) 
                continue;
            sum += count;
            
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

        System.out.println("------------------------------");

        //break 사용 후
        // 1부터 100 까지의 카운트를 하는데 단 합은 50까지만 계산한다.
        count = 0;
        sum = 0;
        while (count < 100) {
            count++;
            if (count > 50) 
                break;
            sum += count;
            
        }
        System.out.printf("count=%d, sum=%d\n", count, sum);

    }
}