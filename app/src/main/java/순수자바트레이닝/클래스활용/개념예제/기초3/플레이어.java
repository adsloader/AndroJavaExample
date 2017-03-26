package 순수자바트레이닝.클래스활용.개념예제.기초3;

/**
 * Created by snake on 16. 8. 24.
 */
public abstract class 플레이어 {
    public void shout(String sMessage){
        String sIam = this.getClass().getName();
        System.out.println(sIam + ":>" + sMessage);
    }

    // 상속받은 클래스들이 알아서 구현해라.
    abstract void attck();
    abstract void defend();
    abstract void drinkRedBottle();
}
