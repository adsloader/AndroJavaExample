package 순수자바트레이닝.클래스활용.개념예제.기초3;

/**
 * Created by snake on 16. 8. 24.
 */
public class 팰러딘 extends 플레이어{
    @Override
    void attck() {
        shout("[공격] 빛의 축복으로 빛나는 나의 철퇴를 받아라!! 악마들아!");
    }

    @Override
    void defend() {
        shout("[방어] 신의 축복으로 너의 공격은 무의미 해질 것이다");
    }

    @Override
    void drinkRedBottle() {
        shout("[마시자] 솟아라! 힘...");
    }
}
