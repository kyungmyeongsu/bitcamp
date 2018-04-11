// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.controller;

import java.util.Scanner;

import bitcamp.java106.pms.annotation.Component;

@Component("calc")
public class CalcController implements Controller {
    Scanner keyScan;
    
    public CalcController(Scanner scanner) {
        this.keyScan = scanner;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("calc")) {
            System.out.print("식을 입력하세요? ");
            String[] arr = keyScan.nextLine().split(" ");
            switch (arr[1]) {
            case "+":
                int result = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
                System.out.printf("%s + %s = %d\n", arr[0], arr[2], result);
                break;
            case "-":
                result = Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
                System.out.printf("%s - %s = %d\n", arr[0], arr[2], result);
                break;
            case "*":
                result = Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
                System.out.printf("%s * %s = %d\n", arr[0], arr[2], result);
                break;
            case "/":
                result = Integer.parseInt(arr[0]) / Integer.parseInt(arr[2]);
                System.out.printf("%s / %s = %d\n", arr[0], arr[2], result);
                break;
            default:
                System.out.println(arr[1] + "연산은 지원하지 않습니다.");
            }
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

}

//ver 23 - 유지보수 테스트를 위해 임시로 만듦.