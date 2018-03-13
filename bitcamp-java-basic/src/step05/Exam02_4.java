package step05;

import java.util.Scanner;

enum Level {
    GUEST2 , MEMBER2, ADMIN2
}

public class Exam02_4 {
    
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("사용자 레벨? ");
        int level = keyScan.nextInt();

        switch (level) {
        case 0:
            System.out.println("조회만 가능 합니다.");
            break;
        case 1:
            System.out.println("글작성 가능 합니다.");
            break;
        case 2:
            System.out.println("다른 회원의 글도 변경, 삭제 할수있습니다.");
            break;
        }

        final int GUEST = 0, MEMBER = 1, ADMIN = 2;
        switch (level) {
        case GUEST:
            System.out.println("조회만 가능 합니다.");
            break;
        case MEMBER:
            System.out.println("글작성 가능 합니다.");
            break;
        case ADMIN:
            System.out.println("다른 회원의 글도 변경, 삭제 할수있습니다.");
            break;
        }

        

        Level userLevel = Level.MEMBER2;

        switch (userLevel) {
        case GUEST2:
            System.out.println("조회만 가능 합니다.");
            break;
        case MEMBER2:
            System.out.println("글작성 가능 합니다.");
            break;
        case ADMIN2:
            System.out.println("다른 회원의 글도 변경, 삭제 할수있습니다.");
            break;
        }
    }
}