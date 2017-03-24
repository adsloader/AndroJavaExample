package 순수자바트레이닝.네째날;

public class 출근{
    public static void main(String[] args) {
        함수_출근해라("이대표", 10, 3);
        함수_출근해라("박사원", 7, 0);
        함수_출근해라("김부장", 10, 0);
    }

    public static void 함수_출근해라(String name, int time, int money){
        int 원하는시간 = 8;
        int 일만원     = 1;
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
