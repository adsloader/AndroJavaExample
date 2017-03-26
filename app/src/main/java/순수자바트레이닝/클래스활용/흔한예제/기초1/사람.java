package 순수자바트레이닝.클래스활용.흔한예제.기초1;

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
}
