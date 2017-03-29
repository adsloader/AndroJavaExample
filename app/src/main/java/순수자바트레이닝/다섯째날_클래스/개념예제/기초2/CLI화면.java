package 순수자바트레이닝.다섯째날_클래스.개념예제.기초2;

import java.util.Scanner;

/**
 * Created by snake on 16. 8. 23.
 */
public class CLI화면 implements 화면관리 {
    @Override
    public void 리포팅하기(String 메시지) {
        System.out.println(메시지);
    }

    @Override
    public String 입력받기(String 메시지) {
        Scanner sc = new Scanner(System.in);
        System.out.println(메시지);

        return sc.nextLine();
    }

    @Override
    public void 화면종료() {

    }
}
