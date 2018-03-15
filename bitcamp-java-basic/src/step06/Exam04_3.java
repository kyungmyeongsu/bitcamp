package step06;

class MyObject {
    int a;
    int b;
}

public class Exam04_3 {

    static MyObject getMyObject() {
        MyObject ref = new MyObject();
        ref.a = 100;
        ref.b = 200;

        return ref;
    }
    public static void main(String[] args) {
        MyObject ref;
        ref = getMyObject();
        
        System.out.println(ref.a);
        System.out.println(ref.b);
    }
}