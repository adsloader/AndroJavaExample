package 순수자바트레이닝.다섯째날_클래스.개념예제.기초3;

/**
 * Created by snake on 16. 8. 24.
 */
public class 게임테스트 {
    public static void main(String[] args) {
        new 게임테스트().doActionEvent();
    }

    public void doActionEvent(){
        // 어떤 클래스가 오건.. 로직에서는 하는 행위는 일정하다.
        플레이어 p  = new 위치닥터();
        플레이어 p2 = new 팰러딘();

        p.attck();
        p2.defend();

        p2.attck();
        p.defend();

        p.drinkRedBottle();
        p2.drinkRedBottle();
    }
}

// 미션 1:
/*
*   플레이어 클래스의
*   abstract void attck();
    abstract void defend();
    abstract void drinkRedBottle();
    를

    void attck(){}
    void defend(){}
    void drinkRedBottle(){};

    로 바꾸고 실행해본다.


* */
// ** abstract class가 왜 필요한지 생각해보는 내용 **

