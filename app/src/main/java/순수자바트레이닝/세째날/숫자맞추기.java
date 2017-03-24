package 순수자바트레이닝.세째날;

import java.util.Scanner;
import java.util.Random;

public class 숫자맞추기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        // 랜덤 숫자만들기
        // 구글링: java 랜덤함수
        Random rnd = new Random();
        int 숨긴번호 = rnd.nextInt(100);

        int num = -1;
        do{
            System.out.println("숫자는?");
            num = sc.nextInt();

            if (num > 숨긴번호){
                System.out.println(">>큽니다.");

            } else if (num < 숨긴번호){
                System.out.println(">>적어요.");
            }

        } while(num != 숨긴번호);

        System.out.println("정답입니다.");

    }
}
