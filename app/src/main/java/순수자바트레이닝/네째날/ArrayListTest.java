package 순수자바트레이닝.네째날;

import java.util.ArrayList;

/**
 * Created by snake on 17. 3. 27.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <String> ar = new ArrayList<>();
        ar.add("움하하하1");
        ar.add("움하하하2");
        ar.add("움하하하3");

        // 첫번째 파라메터로 위치를 입력하고 값을 저장할 수 있다.
        ar.add(0, "움하하하4");

        // indexOf() 메소드는 파라메터로 값을 넘기고
        // 그 값과 일치하는 항목의 위치를 넘겨준다.
        int nIndx = ar.indexOf("움하하하4");
        System.out.println("움하하하4 is " + nIndx);
        System.out.println("ar size = " + ar.size());

        ar.remove(0);

        nIndx = ar.indexOf("움하하하4");
        System.out.println("움하하하4 is " + nIndx);
        System.out.println("ar size = " + ar.size());

    }
}
// 미션 1:
//  1. 1부터 1000까지 추가한다.
//  2. 그리고 순서를 바꾼다.
//  3. 데이터크기만큼 루프를 돌면서 화면에 출력한다.

