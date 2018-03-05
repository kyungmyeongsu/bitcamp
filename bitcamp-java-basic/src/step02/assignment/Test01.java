package step02.assignment;

public class Test01 {
    public static void main(String[] args) {
        String c;
        int i1, i2, i3, i4;
        float f;
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        System.out.print("이름? ");
        c = keyScan.nextLine();

        System.out.print("국어? ");
        i1 = keyScan.nextInt();
        System.out.print("영어? ");
        i2 = keyScan.nextInt();
        System.out.print("수학? ");
        i3 = keyScan.nextInt();

        i4 = i1+i2+i3;
        f = i4/3;
        System.out.println("-----------------");
        System.out.print(c+" ");
        System.out.print(i1+" ");
        System.out.print(i2+" ");
        System.out.print(i3+" ");
        System.out.print(i4+" ");
        System.out.print(f);
    }
}
