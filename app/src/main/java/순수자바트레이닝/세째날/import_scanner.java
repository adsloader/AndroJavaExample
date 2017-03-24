package 순수자바트레이닝.세째날;

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
