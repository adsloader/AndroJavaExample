package 순수자바트레이닝.클래스활용.흔한예제.기초2;

/**
 * Created by park on 2016-08-17.
 */
public class 사람 extends 짐승 {

    public void 점심먹다(){
        this.먹이 = "밥";
        System.out.println(먹이 + "을 12시 전후에 먹다.");
    }

    public void 저녁먹다(){
        this.먹이 = "밥";
        System.out.println(먹이 + "을 6시 전후에 먹다.");
    }

    // 오버라이드
    // 선조의 메소드를 내가 재정의해서 사용한다.
    @Override
    public void 반응한다() {
        String s = 따라해봐();
        System.out.println("당신은 \'" + s + "\'라고 말했습니다.");
    }

    // 오버라이드 에러
    // @Override 사용안함 먹는다()를 하려고 했음. but 먹는디()라고 정의함
    // 내 머리속에는 저것이 먹는다()로 각인됨. 결국 논리적에러가 발생함.
    public void 먹는디() {
        System.out.println("내가 뭘 먹던!!");
    }
}
