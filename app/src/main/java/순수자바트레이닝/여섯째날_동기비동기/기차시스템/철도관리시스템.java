package 순수자바트레이닝.여섯째날_동기비동기.기차시스템;

/**
 * Created by snake on 16. 8. 25.
 */
public class 철도관리시스템 {
    public static void main(String[] args) {
        KTX열차 train = new KTX열차();

        // 태우고 이동
        여행객 person1 = new 여행객("박모씨", "부산");
        여행객 person2 = new 여행객("김모씨", "천안");
        train.passenger_in_train(person1);
        train.passenger_in_train(person2);
        train.다음역에도착();

        // 태우고 이동
        여행객 person3 = new 여행객("한모씨", "부산");
        train.passenger_in_train(person3);

        // 이동
        train.다음역에도착();
        train.다음역에도착();
        train.다음역에도착();

        train.다음역에도착();
    }
}
