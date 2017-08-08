package 순수자바트레이닝.세째날;

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

    public static void main(String[] args) {
        숫자게임 게임 = new 숫자게임();
        게임.다음범위로_초기화(50);

        do {
            int num    = 게임.번호를입력하세요();
            int result = 게임.이번호가니번호냐(num);

            if(result == 0){
                break;

            } else if (result < 0){
                System.out.println ("적어요");

            } else{
                System.out.println ("커요");
            }

        } while (true);

        System.out.println ("맞추었습니다");

    }
}

/*
    미션  1: 몇번만에 맞추었는 지 출력한다.
    미션  2: 10번안에 맞추지 못하면 "실패" 메시지를 출력하고 프로그램을 종료한다.
*
* */