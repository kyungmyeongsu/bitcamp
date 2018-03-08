package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Score;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Score[] scores = new Score[5];

        // for(int i = 0; i < scores.length; i++) {
        //     scores[i] = new Score();
        // }

        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            count++;
            scores[i] = new Score();

            System.out.print("팀명? ");
            scores[i].teamName = keyScan.nextLine();
            System.out.print("설명? ");
            scores[i].inform = keyScan.nextLine();
            System.out.print("최대인원? ");
            scores[i].maxNum = keyScan.nextInt();
            keyScan.nextLine();
            System.out.print("시작일? ");
            scores[i].startDate = keyScan.nextLine();
            System.out.print("종료일? ");
            scores[i].endDate = keyScan.nextLine();
            System.out.print("계속 입력하시겠습니까?(Y/n)? ");
            scores[i].yn = keyScan.nextLine();
            String con = scores[i].yn;
            if(con.toLowerCase().equals("n")) {
                break;
            }else if(con.toLowerCase().equals("y")) {
                continue;
            }
        }

        System.out.println("---------------------------");
        
        for(int i = 0; i < count; i++) {
            // String tName = scores[i].teamName;
            // if(tName.equals("null")) {
            //     break;
            // }else
            System.out.printf("%s, %d명, %s ~ %s\n", 
            scores[i].teamName, scores[i].maxNum,
            scores[i].startDate, scores[i].endDate);
        }
    }
}