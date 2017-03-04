package 순수자바트레이닝.첫날;

/**
 * Created by snake on 17. 3. 5.
 */

// 클래스에서 필수사항
// 1. 모든 변수와 메소드는 class내({})에 존재해야 한다.
// 2. 메소드외의 영역에서는 변수를 선언 및 초기화만 가능하다.
// 3. 변수나 클래스를 어디서나 이해할 수 있는 것은 아니다. <- scope

public class 데이터와변수범위 {
    // 무조건 4칸 들여쓰기!
    // 클래스 내에서 모두 인식하려면
    // class를 선언하고 { 를 한 이후에
    // 변수를 선언하는 것이 좋다.
    // 이를 java에서는 멤버필드라고 한다.
    int age = 0;  // 선언과 함께 초기화도 가능하다.

    // main 함수라는 것은 자바가 실행될 때,
    // 처음실행되는 함수이다.
    public static void main(String[] args) {
        // 이곳에서는 아래코드를 이해 못한다.
        // age = 1;

        int age = 100;
        System.out.println(age);

        // {}안에 선언된 변수는 밖에서 알 수 없다.
        {
            int j = 0;
            System.out.println(j);
        }

        // {} 안의 j는 {} 밖에서 알 수 없다.
        // System.out.println(j);
    }

}
