package step02.assignment;

public class Test02 {
    public static void main(String[] args) {
        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] avg = new float[5];
        
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        for(int i = 0; i < 5; i++) {
            System.out.print("입력? ");
            name[i] = keyScan.next();
            kor[i] = keyScan.nextInt();
            math[i] = keyScan.nextInt();
            eng[i] = keyScan.nextInt();
            sum[i] = kor[i] + math[i] + eng[i];
            avg[i] = sum[i] / 3;
        }


        System.out.println("-----------------");

        for(int i = 0; i < 5; i++) {
            System.out.printf("%s %d %d %d %d %f\n", name[i], kor[i], eng[i], math[i], sum[i], avg[i]);
            System.out.println(name[i]+" "+kor[i]+" "+math[i]+" "+eng[i]+" "+sum[i]+" "+avg[i]);
        }
        
    }
}
