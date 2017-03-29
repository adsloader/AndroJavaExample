package 순수자바트레이닝.다섯째날_클래스.개념예제.기초2;

/**
 * Created by snake on 16. 8. 23.
 */
public class 화면테스트 {
    public 화면관리 관리;

    public 화면테스트(화면관리 view ){
        this.관리 = view;
    }
    public static void main(String[] args) {

        // 넘겨지는 파라메터 값에 따라 ...
        // 기능이 달라진다.

        // 아래의 GUI는 Intelli J로 구현했던 것임
        // 재대로 돌아가려면 IntelliJ의 프로젝트를 활용해야 함.
        // 화면테스트 테스트 = new 화면테스트(new GUI화면());
        화면테스트 테스트 = new 화면테스트(new CLI화면());
        테스트.관리.리포팅하기("테스팅...");

        do {
            String 입력값 = 테스트.관리.입력받기("뭐라도 입력해보세요:");
            if(입력값.equals("quit")){
                break;
            }
            System.out.println(입력값);

        } while(true);
        테스트.관리.화면종료();
    }
}
