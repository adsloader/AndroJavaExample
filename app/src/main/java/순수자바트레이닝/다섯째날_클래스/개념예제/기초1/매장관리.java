package 순수자바트레이닝.다섯째날_클래스.개념예제.기초1;

import java.util.Scanner;

/*
*    매장관리를 위한 base 다섯째날_클래스
*    일반적으로 이런 base 클래스는 코딩할 때 볼일이 없어야
*    좋은 코딩이 나온다. <- 알필요없는 것들은 알지 말아야 한다.
* */
class 매장관리{
    public static final int 추가 = 1;
    public static final int 삭제 = 2;
    public static final int 검색 = 3;
    public static final int 조회 = 4;

    public void On요청받다(String 메시지, int 분류){
    }

    public void 매장영업시작(){
        do {
            int    n = 종류입력받기();
            String s = "";
            if(n != 조회 ){
                s = 메시지입력받기();
            }
            On요청받다(s, n);
        } while(true);
    }

    private String 메시지입력받기() {
        Scanner sc = new Scanner(System.in);
        리포팅하기("상품명 입력:");
        String s = sc.nextLine();
        return s;
    }

    private int 종류입력받기() {
        Scanner sc = new Scanner(System.in);
        리포팅하기("------1: 입력 2: 삭제 3:찾기 4: 조회------");
        int n = sc.nextInt();
        return n;
    }

    public void 리포팅하기(String 메시지){
        System.out.println(메시지);
    }
}