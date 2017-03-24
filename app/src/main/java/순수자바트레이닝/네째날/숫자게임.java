package 순수자바트레이닝.네째날;

import java.util.Random;
import java.util.Scanner;
public class 숫자게임{
    private int hidden_number = 0;

    public void 다음범위로_초기화(int 범위){
        Random rnd    = new Random();
        hidden_number = rnd.nextInt(범위);
    }

    // 0이면 맞춤. 0보다 크면 (크다) . 0보다 작으면 (작다)
    public int 이번호가니번호냐(int 번호){
        return 번호 - hidden_number;
    }

    public int 번호를입력하세요(){
        System.out.println("번호를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        return num;
    }
}
