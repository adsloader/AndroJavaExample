package 순수자바트레이닝.둘째날;

import java.util.Scanner;
public class import_scanner{
    public static void main(String[] args) {

        // Console(도스창)에서 문자를 입력받는 방법
        Scanner sc = new Scanner (System.in);

        System.out.println("당신의 이름은?");

        // 문자열 입력
        String name = sc.nextLine();

        System.out.println("당신의 나이는?");

        // 숫자입력
        int age = sc.nextInt();

        System.out.println(" 이름은 " + name + "나이는 " + age);
    }
}

// 힌트: Scanner()
// 미션 1:
// 숫자 2개를 입력받는다
// 그 곱하기 결과값을 화면에 출력한다.
// ex: 1, 2를 입력받았다면
// 1 * 2 = 2
