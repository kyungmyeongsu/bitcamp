package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        Team[] teams = new Team[100];
        Member[] members = new Member[100];

        int count1 = 0;
        int count2 = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i < teams.length; i++) {

            System.out.print("명령> ");
            String pm = keyScan.nextLine();
            String arr[] = pm.split(" ");

            teams[i] = new Team();
            members[i] = new Member();

            if(arr[0].toLowerCase().equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
            }

            else if(arr[0].toLowerCase().equals("team/add")) {
                    System.out.print("팀명? ");
                    teams[count1].teamName = keyScan.nextLine();
                    System.out.print("설명? ");
                    teams[count1].inform = keyScan.nextLine();
                    System.out.print("최대인원? ");
                    teams[count1].maxNum = keyScan.nextInt();
                    keyScan.nextLine();
                    System.out.print("시작일? ");
                    teams[count1].startDate = keyScan.nextLine();
                    System.out.print("종료일? ");
                    teams[count1].endDate = keyScan.nextLine();
                    count1++;
            }

            else if(arr[0].toLowerCase().equals("team/list")) {
                
                for(int j = 0; j < count1; j++) {
                    System.out.printf("%s, %d, %s ~ %s\n", 
                    teams[j].teamName, teams[j].maxNum,
                    teams[j].startDate, teams[j].endDate);
                }
            }

            else if(arr[0].toLowerCase().equals("team/view")) {
                    if (arr.length > 1) {
                        int j;
                        for (j = 0; j < count1; j++) {
                            if (arr[1].equals(teams[j].teamName.toLowerCase())) {
                                System.out.println("팀명: " + teams[j].teamName);
                                System.out.println("설명: " + teams[j].inform);
                                System.out.println("최대인원: " + teams[j].maxNum);
                                System.out.println("기간: " + teams[j].startDate + " ~ " + teams[j].endDate);
                                break;
                            }
                        }
                        if (!arr[1].equals(teams[j].teamName)) {
                            System.out.println("해당 이름의 팀이 없습니다.");
                        }
                        
                    }else {
                        System.out.println("팀명을 입력하시기 바랍니다.");
                    }
            }

            else if(arr[0].toLowerCase().equals("member/add")) {
                    System.out.print("아이디? ");
                    members[count2].id = keyScan.nextLine();
                    System.out.print("이메일? ");
                    members[count2].email = keyScan.nextLine();
                    System.out.print("암호? ");
                    members[count2].passwd = keyScan.nextInt();
                    keyScan.nextLine();
                    count2++;
            }

            else if(arr[0].toLowerCase().equals("member/list")) {
                
                for(int v = 0; v < count2; v++) {
                    System.out.printf("%s, %s, %d\n", 
                    members[v].id, members[v].email, members[v].passwd);
                }
            }

            else if(arr[0].toLowerCase().equals("member/view")) {
                if (arr.length > 1) {
                    int v;
                    for(v = 0; v < count2; v++) {
                        if (arr[1].equals(members[v].id.toLowerCase())) {
                            System.out.println("아이디: " + members[v].id);
                            System.out.println("이메일: " + members[v].email);
                            System.out.println("암호: " + members[v].passwd);
                            break;
                        }
                    }
                    if (!arr[1].equals(members[v].id)) {
                        System.out.println("해당 아이디의 회원이 없습니다.");
                    }
                }else {
                    System.out.println("아이디를 입력하시기 바랍니다.");
                }
            }

            else if(arr[0].toLowerCase().equals("quit")) {
                System.out.println("안녕히가세요!");
                break;
            }

            else{
                System.out.println("명령어가 올바르지 않습니다.");
            }

            System.out.println();
        }
        
    }
}