package step04;

public class Exam02_2 {
    public static void main(String[] args) {
        double d1 = 987.6543;
        double d2 = 1.111111;
        System.out.println((d1+d2) == 988.765411);
        System.out.println(d1+d2);

        System.out.println(Math.abs(d1 + d2));

        double x = 234.765411;
        double y = 754.0;
        System.out.println(x + y);

        System.out.println((d1 + d2) == (x + y));

        double EPSILON = 0.00001;
        System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSILON);
    }
}