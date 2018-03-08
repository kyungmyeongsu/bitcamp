package step03.assignment;

public class Test01 {
    public static void main(String[] args) {

        java.util.Scanner keyScan = new java.util.Scanner(System.in);

        step03.Score[] scores = new step03.Score[3];

        for(int i = 0; i < scores.length; i++) {
            scores[i] = new step03.Score();

            System.out.print("입력? ");
            scores[i].name = keyScan.next();
            scores[i].kor = keyScan.nextInt();
            scores[i].eng = keyScan.nextInt();
            scores[i].math = keyScan.nextInt();
            scores[i].sum = scores[i].kor + scores[i].eng + scores[i].math;
            scores[i].aver = scores[i].sum / 3;
        }
        
        System.out.println("---------------------------");

        for(int i = 0; i < scores.length; i++) {
            System.out.printf("%s %3d %3d %3d %3d %5.1f\n", 
                scores[i].name, 
                scores[i].kor, scores[i].eng, scores[i].math, 
                scores[i].sum, scores[i].aver);
        }
        
        // Score[] arr = new Score[3];
        
        // for(int i = 0; i < arr.length; i++) {
        //     arr[i] = new Score();

        //     System.out.print("입력? ");
        //     arr[i].name = keyScan.next();
        //     arr[i].kor = keyScan.nextInt();
        //     arr[i].eng = keyScan.nextInt();
        //     arr[i].math = keyScan.nextInt();

        //     arr[i].sum = arr[i].kor + arr[i].eng + arr[i].math;
        //     arr[i].aver = arr[i].sum / 3;
        // }

        // System.out.println("---------------------------");

        // for(int i = 0; i < arr.length; i++) {
        //     System.out.printf("%s ", arr[i].name);
        //     System.out.printf("%d ", arr[i].kor);
        //     System.out.printf("%d ", arr[i].eng);
        //     System.out.printf("%d ", arr[i].math);
        //     System.out.printf("%d ", arr[i].sum);
        //     System.out.printf("%.1f\n", arr[i].aver);
        // }


    }
}