package 순수자바트레이닝.첫날;

/**
 * Created by snake on 17. 3. 23.
 */

public class 연산자 {
    public static void main(String[] args) {
        int i = 0;
        i++;
        i++;
        System.out.println(i + " i is ++" );

        i--;
        i--;
        System.out.println(i + " i is --" );

    }
}

// 힌트: 연산자가 앞에 있나 뒤에 있나의 차이.
// 미션 1:
// 17번 라인에 System.out.println(++i);을 코딩하고 실행한다.
// 17번 라인에 System.out.println(i++);을 코딩하고 실행한다.
// 2개의 차이점을 설명한다.