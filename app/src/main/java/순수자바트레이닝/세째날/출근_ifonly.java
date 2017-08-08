package 순수자바트레이닝.세째날;

public class 출근_ifonly{
    public static void main(String[] args) {

      // 비교기준이 되는 값
      int 원하는시간 = 8;
      int 일만원     = 1;

      // 개인정보
      String name    = "이대표";
      int    money   = 3;
      int    time    = 10;

      // 비교
      if (time > 원하는시간){
          System.out.println(name + " 세수하지 말아라.");
          if (money >= 일만원){
              System.out.println(name + " Taxi를 타라.");
              System.out.println(name + " 홍대에 가라.");
          }
      } else {
          System.out.println(name + " 세수를 한다.");
          System.out.println(name + " 전철을 탄다.");
          System.out.println(name + " 홍대에 간다.");
      }


    // 사람하나 더 추가요
    // 개인정보
    name    = "김부장";
    money   = 1;
    time    = 10;

    // 비교
    if (time > 원하는시간){
        System.out.println(name + " 세수하지 말아라.");
        if (money >= 일만원){
            System.out.println(name + " Taxi를 타라.");
            System.out.println(name + " 홍대에 가라.");
        }
    } else {
        System.out.println(name + " 세수를 한다.");
        System.out.println(name + " 전철을 탄다.");
        System.out.println(name + " 홍대에 간다.");
    }

    // 사람하나 더 추가요
    // 개인정보
    name    = "박대리";
    money   = 1;
    time    = 7;

    // 비교
    if (time > 원하는시간){
        System.out.println(name + " 세수하지 말아라.");
        if (money >= 일만원){
            System.out.println(name + " Taxi를 타라.");
            System.out.println(name + " 홍대에 가라.");
        }
    } else {
        System.out.println(name + " 세수를 한다.");
        System.out.println(name + " 전철을 탄다.");
        System.out.println(name + " 홍대에 간다.");
    }

  }

}
// 미션 1: 위의 소스를 함수를 사용하여 간편화한다.
/*
*  public static void main(String[] args) {
        함수_출근해라("이대표", 10, 3);
        함수_출근해라("박사원", 7, 0);
        함수_출근해라("김부장", 10, 0);
   }

  으로 간단하게 코딩할 수 있도록 중복되는 내용을 함수로 만든다.
  public static void 함수_출근해라(String name, int time, int money){
  }
  메소드 안에 중복코드를 정리해본다.

*
* */
// 힌트: 구현된 소스 -> 출근.java
// https://github.com/adsloader/ClassBasic/blob/master/src/%EC%84%B8%EC%A7%B8%EB%82%A0/%EC%B6%9C%EA%B7%BC.java
