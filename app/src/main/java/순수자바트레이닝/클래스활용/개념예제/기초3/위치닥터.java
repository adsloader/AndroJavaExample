package 순수자바트레이닝.클래스활용.개념예제.기초3;

/**
 * Created by snake on 16. 8. 24.
 */
public class 위치닥터 extends 플레이어{
    @Override
    void attck() {
        shout("[공격]저주를 받아라..!#@$%$@%^%^%");
    }

    @Override
    void defend() {
        shout("[방어]어둠의 아우라여 나를 보호하라.. @#@!!!!");
    }

    @Override
    void drinkRedBottle() {
        shout("[마시자]쿠에에억~");
    }
}
