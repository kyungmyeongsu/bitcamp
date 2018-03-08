package step04;

public class Exam01_4 {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        float r = (float)i / (float)j;
        System.out.println(r);

        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        int r1 = x + y;
        long r2 = x + y; 
        System.out.println(r1);
        System.out.println(r2);

        float f1 = 987.6543f;
        float f2 = 1.1111111f;
        float r3 = f1 + f2;
        double r4 = f1 + f2;
        System.out.println(r3);
        System.out.println(r4);

        double d1 = 987.6543f;
        double d2 = 1.1111111f;
        double r5 = d1 + d2;
        System.out.println(r5);
    }
}