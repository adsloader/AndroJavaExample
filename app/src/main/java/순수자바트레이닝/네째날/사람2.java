package 순수자바트레이닝.네째날;

import java.util.Scanner;
public class 사람2 {
    private String name;
    private int    age;

    public String 내이름알려주기(){
        return name;
    }

    public void 내이름저장하기(){
        System.out.println("이름을 입력하세요:");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
    }

    public int 내나이알려주기(){
        return age;
    }

    public void 내나이저장하기(){
        System.out.println("나이를 입력하세요:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
    }

}
