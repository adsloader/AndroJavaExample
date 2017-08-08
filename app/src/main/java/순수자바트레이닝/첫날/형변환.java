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

// 힌트:
// 미션 1:
// 18번라인 float f = (float)i / (float)j; 에서 f를 double로 바꾸고 실행해본다.
// 미션 2:
// 소수점 3자리까지만 출력한다.
// 구글검색: https://www.google.co.kr/search?q=java+double+%EC%86%8C%EC%88%98%EC%A0%90+%EC%9E%90%EB%A6%AC%EC%88%98&oq=java+double+thtn&aqs=chrome.3.69i57j0l5.7079j0j7&sourceid=chrome&ie=UTF-8

