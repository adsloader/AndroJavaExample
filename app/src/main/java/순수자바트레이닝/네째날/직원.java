package 순수자바트레이닝.네째날;

public class 직원{
    public String name;
    public int    money;

    private int 원하는시간 = 8;
    private int 일만원     = 1;

    public void 출근한다(int time){
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
