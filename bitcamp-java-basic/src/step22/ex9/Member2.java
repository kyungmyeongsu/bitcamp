package step22.ex9;

public class Member2 implements java.io.Serializable{
    String name;
    int age;
    boolean gender; // true(여자), false(남자)
    
    // Exam02_4.java 를 실행하기 전에 다음 변수를 추가하고, toString()을 개정하라!
    String tel;

    @Override
    public String toString() {
        return "Member2 [name=" + name + ", age=" + age + ", gender=" + gender + ", tel=" + tel + "]";
    }
    
    
}
