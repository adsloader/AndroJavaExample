package 순수자바트레이닝.다섯째날_클래스.개념예제.기초1;

/**
 * Created by park on 2016-08-17.
 */
public class 매장 extends 매장관리{
    상품관리 제품들 = new 상품관리();

    public static void main(String[] args) {
        // 달랑 2줄.
        매장 우리가게 = new 매장();
        우리가게.매장영업시작();
    }

    @Override
    public void On요청받다(String 메시지, int 분류) {

        switch (분류){
            case 매장관리.추가:
                제품들.제품추가(new 상품(메시지) );
                break;

            case 매장관리.삭제:
                제품들.제품삭제(메시지);
                break;

            case 매장관리.검색:
                int n = 제품들.제품찾기(메시지);
                리포팅하기(">>>" + n + " 번째 위치함.");
                break;

            case 매장관리.조회:
                for(int i =0; i < 제품들.제품개수(); i++){
                    상품 제품 = 제품들.가져오기(i);
                    리포팅하기(i + ":->" + 제품.이름얻기() + " 입니다.");
                }
                break;

            default:
                // 모르는 명령.
        }

        리포팅하기("===========================");
        리포팅하기("총 " + 제품들.제품개수() + " 개");
        리포팅하기("===========================");
    }
}
// 미션 1:
// public class 매장 extends 매장관리{ ...}에서
// 매장 클래스를 매장관리가 아닌 매장관리GUI class에서 상속받고 실행해본다.
// ** 상속이 왜 필요한지 생각해보는 내용 **
// <-- Android Studio에서는 swing 읽어오는 것이 문제있어 intellij에서 테스트

