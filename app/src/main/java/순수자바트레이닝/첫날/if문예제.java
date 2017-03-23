package 순수자바트레이닝.첫날;

// 비교연산자를 통하여 숫자비교한다. 결과적으로
// 코드를 수행하는 순서가
// 8, 9, 13, 14, 15 라인이 된다.
public class if문예제 {
    public static void main(String[] args) {
        int n = 3;
        if(n > 3){
            System.out.println("3보다 큽니다");

        } else {
            System.out.println("0보다 크고 3보다 작습니다");
        }
    }
}
