package 순수자바트레이닝.둘째날;

public class for_test{
    public static void main(String[] args) {

        // for(;;3){}문의 ()안에 ; 단위로 분류.
        // 첫번째는 카운트할 변수 초기화
        // 두번째는 실행조건,
        // 세번째는 변수의 증감
        for(int i =0; i < 10; i++){
            System.out.println(i + " 번째 입니다");
        }

        int sum = 100;
        for(int i=0; i < 150; i++) {
            sum = sum - 1;
            if (sum  > 50) {
                continue;
            } else if(  sum <= 50 && sum > 0){
                System.out.println("i=" + i + "> "+ sum + " 남았습니다.");
            } else {
                break;
            }
        }

    }
}
