package 순수자바트레이닝.세째날;

public class 회사{
    public static void main(String[] args) {
        직원 박모씨 = new 직원();
        박모씨.money = 10;
        박모씨.name  = "박부장";
        박모씨.출근한다(9);
    }
}
// 미션 1:
/*
        박모씨.money = 10;
        박모씨.name  = "박부장";
        를 삭제하고
        직원 박모씨 = new 직원(10, "박부장");
        으로 바꾸어도 같은 결과가 나오도록
        직원 클래스를 고쳐볼 것
*
* */