package 순수자바트레이닝.여섯째날_동기비동기.기차시스템2;

import java.util.Scanner;

/**
 * Created by snake on 16. 8. 25.
 */
public class 철도관리시스템 {
    public static void main(String[] args) {
        KTX열차 train = new KTX열차();

        // 천천히 알아서 운행해라... 먼저 호출해야 함.
        KTX운행중(train);

    }

    // 1초마다 다음역으로 이동해라.
    private static void KTX운행중(final KTX열차 train) {

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                do{

                    try {
                        train.On다음역도착할때();

                        Thread.sleep(1000 * 2);

                    } catch (InterruptedException e) {
                        System.out.println("운행을 마칩니다.");
                        break;
                    }

                } while (true);
            }
        });

        t.start();

    }

}

//
/*
 미션 1: 맨마지막에 발생하는 에러를 잡을 것
 미션 2: 승객정보를 입력받은 후에는, 현재 기차에 탄 승객의 정보를 모두 보여준다.
 미션 3: 승객정보를 입력할 때, 기존에 있는 승객과 같은 정보(이름, 행선지)가 있으면 추가하지 않는다.
*/

