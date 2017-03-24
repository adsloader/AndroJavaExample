package 순수자바트레이닝.네째날;

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
