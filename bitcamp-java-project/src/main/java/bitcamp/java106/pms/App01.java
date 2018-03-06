package bitcamp.java106.pms;

public class App01 {
    public static void main(String[] args) {
        String s1, s2, s3, s4;
        int i1;

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("팀명? ");
        s1 = keyScan.nextLine();

        System.out.print("설명? ");
        s2 = keyScan.nextLine();

        System.out.print("최대인원? ");
        i1 = keyScan.nextInt();
        keyScan.nextLine();

        System.out.print("시작일? ");
        s3 = keyScan.nextLine();
        
        System.out.print("종료일? ");
        s4 = keyScan.nextLine();

        System.out.println("-------------------------------");
        System.out.println("팀명: "+ s1);
        System.out.println("설명:");
        System.out.println(s2);
        System.out.println("최대인원: " + i1 + "명");
        System.out.println("일자: " + s3 + " ~ " + s4);
    }
}