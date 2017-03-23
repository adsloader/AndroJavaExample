package 순수자바트레이닝.첫날;

/**
 * Created by snake on 17. 3. 23.
 */

public class 형변환 {
    public static void main(String[] args) {
        int i = 5;
        int j = 3;

        // 형변환은 변수의 크기를 바꾸는 연산자.
        // 모든 형이 변경가능한 것이 아니다.
        // 프로그래밍을 하다보면 어쩔 수 없이 먼저 선언된
        // 변수의 크기를 변경해서 값 처리를 해야 할 경우가
        // 자주 생긴다.
        // 18번 라인은 i와 j를 float형으로 바꾼 후, 연산했다.
        float f = (float)i / (float)j;
        System.out.print(f);
    }
}
