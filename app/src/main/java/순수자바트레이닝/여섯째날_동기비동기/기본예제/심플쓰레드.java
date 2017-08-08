package 순수자바트레이닝.여섯째날_동기비동기.기본예제;
import java.util.Scanner;

/**
 * Created by snake on 16. 8. 25.
 */
public class 심플쓰레드 {
    public static void main(String[] args) {
        final 심플쓰레드 테스트 = new 심플쓰레드();

        Thread t = 따로도는쓰레드( 테스트 );

        테스트.내쓰레드입력처리();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static Thread 따로도는쓰레드(final 심플쓰레드 테스트) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    테스트.리포팅(i + "번째");

                    try {
                        Thread.sleep(1000 * 3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t.start();

        return t;
    }

    private void 내쓰레드입력처리() {

        Scanner sc = new Scanner(System.in);
        do{
            리포팅("메인쓰레드 입력입니다:");
            String s = sc.nextLine();
            if (s.equals("quit")){
                break;
            }
            리포팅("입력 ->"  + s);

        } while (true);

    }

    public void 리포팅(String s){
        long 쓰레드번호 = Thread.currentThread().getId();
        System.out.println("id = " + Long.toString(쓰레드번호) + " >" +s);
    }
}

// 미션 1:
/*
     quit을 입력했을 때,
     따로도는쓰레드도  실행을 멈출 수 있게
     코딩을 할 것

*/
