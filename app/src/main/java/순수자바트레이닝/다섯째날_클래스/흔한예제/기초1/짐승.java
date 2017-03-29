package 순수자바트레이닝.다섯째날_클래스.흔한예제.기초1;

import java.util.Scanner;

public class 짐승 {
    public String 소리 = "캬하하우허허허엉~~";
    public String 먹이 = "#@%^&ㅃㅃ";

    public String 따라해봐(){
        Scanner sc = new Scanner(System.in);
        System.out.println(me() + "에게 다음을 따라하게 한다.");
        return sc.nextLine();
    }

    public void 반응한다(){
        String 말 = 따라해봐();
        System.out.println(me() + ": 크하야야아아옹! ~ -따라못한다는 말-");
    }

    public String me(){
        return  "나는 " + this.getClass().toString() + ":";
    }

    public void 먹는다(){
        System.out.println(me() + this.먹이 + "를 먹는다." );
    }

    public void 소리친다(){
        System.out.println(me() + this.소리 + "~~." );
    }
}
