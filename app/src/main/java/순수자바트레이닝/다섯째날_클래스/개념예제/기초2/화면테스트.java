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

        //화면테스트 테스트 = new 화면테스트(new GUI화면()); <-- Android Studio에서는 Swing 가져오기 문제있음.
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

// 미션 1:
// 화면테스트 테스트 = new 화면테스트(new GUI화면());을
// 화면테스트 테스트 = new 화면테스트(new CLI화면());을 바꾸고 실행해본다.
// ** Interface가 왜 필요한지 생각해보는 내용 **

