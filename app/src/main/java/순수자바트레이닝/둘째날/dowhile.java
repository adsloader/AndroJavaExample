package 순수자바트레이닝.둘째날;

import java.util.Scanner;
public class dowhile{
    public static void main(String[] args) {

        int i = 0;

        // do while문은 일단 시작하고 while안의 조건이 맞으면 {}안의 내용을 반복한다.
        do{
            i++;
            System.out.println("i = " + i + " 로 보여진다.");
            if(i == 4) i = 10;
        } while( i < 10);

        Scanner sc = new Scanner (System.in);
        System.out.println("do{...} while()의 마지막 결과값은?");
        int num = sc.nextInt();
        while (num != i){
            System.out.println("do{...} while()의 마지막 결과값은?");
            num = sc.nextInt();
        }

        System.out.println("마지막 결과값은 .." + i);
    }
}

// 힌트: Scanner()
// 미션 1:
// 100까지 진행하게 하고 짝수일 경우만 화면에 출력하게 한다.