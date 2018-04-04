// 빌딩을 상석 받아 startEffect()와 endEffect()를 구체화 시킨다.
package step15.ex3;

public class Restautant extends Building{
    public void startEffect() {
        System.out.println("뚝딱...뚝딱~~~~");
    }
    
    public void endEffect() {
        System.out.println("와우 ~~~배고픔에서 해방~~");
    }
}
