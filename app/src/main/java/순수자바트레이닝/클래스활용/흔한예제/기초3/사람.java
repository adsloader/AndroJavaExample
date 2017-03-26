package 순수자바트레이닝.클래스활용.흔한예제.기초3;

/**
 * Created by park on 2016-08-17.
 */
public class 사람 extends 짐승 {

    public void 밥을먹는다(){
        this.먹는다();
    }

    public void 밥을먹는다(String 음식){
        System.out.println(음식 + "을 먹는다.");
    }

    public void 밥을먹는다(String 음식, int 시간){
        System.out.println(음식 + "을 " + 시간 +"시에 먹는다.");
    }

    public void 밥을먹는다(String 음식, int 시간, String 누구){
        System.out.println(음식 + "을 " + 시간 +"시에 " + 누구 + "와 먹는다.");
    }

    // 오버라이드
    // 선조의 메소드를 내가 재정의해서 사용한다.
    @Override
    public void 반응한다() {
        String s = 따라해봐();
        System.out.println("당신은 \'" + s + "\'라고 말했습니다.");
    }

}
