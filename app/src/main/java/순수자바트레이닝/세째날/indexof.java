package 순수자바트레이닝.세째날;

import java.util.Scanner;
public class indexof {
  public static void main(String[] args) {

      // 문자열도 String Class처럼 사용할 수 있다.
      // String Class안에는 indexOf라는 메소드가 있는데..
      // 파라메터로 문자열을 넘겨주면 해당 문자열이 위치한
      // 위치를 넘겨준다(자바에서 처음은 무조건 0으로 시작).
      int n = "abcdefg".indexOf("cd");

      // Integer.toString은 숫자를 문자열로 바꾸어준다.
      System.out.println( Integer.toString(n) );

      String name = "abcdefgh";
      Scanner sc = new Scanner (System.in);

      System.out.println(name + "안의 문자열 입력:");

      String s   = sc.nextLine();
      int nPosit = name.indexOf(s);

      System.out.println(name + "안의 위치는 " + nPosit);

  }  
}
