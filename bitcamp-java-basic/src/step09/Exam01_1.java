// 생성자 활용 예 - 자바에서 제공하는 클래스 사용을 통해 생성자 활용을 익혀보자!
package step09;

public class Exam01_1 {
    public static void main(String[] args) throws Exception{
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        
        // 다른 생성자를 사용하여 스트링 인스턴스를 초기화시키기
        char[] chars = new char[] {'H', 'e', 'l', 'l', 'o'};
        String s3 = new String(chars);
        
        System.out.printf("%s %s %s\n", s1, s2, s3);
        
        byte[] bytes = {(byte)0xb0, (byte)0xa1, (byte)0xb0, (byte)0xa2, 
                        (byte)0xb6, (byte)0xca, (byte)0xb6, (byte)0xcb};
        String s4 = new String(bytes);
        System.out.println(s4);
        
        String s5 = new String(bytes, "EUC-KR");
        System.out.println(s5);
    }
}
