package 순수자바트레이닝.네째날;

public class 상영중 {
    public static void main(String[] args) {
        고객관리 영화관 = new 고객관리();
        영화관.고객추가(new 사람3(47, "박모씨") );
        영화관.고객추가(new 사람3(23, "김모씨") );
        영화관.고객추가(new 사람3(28, "정모양") );
        영화관.고객추가(new 사람3(35, "이모양") );

        int nCount = 영화관.고객개수();
        System.out.println("관람객 수는" + nCount);

        int nIndex = 영화관.고객찾기("이모양");
        System.out.println(nIndex + " 번째 관람객");

        영화관.고객삭제("박모씨");
        nCount = 영화관.고객개수();
        System.out.println("관람객 수는" + nCount);

        영화관.고객추가(new 사람3(22, "움하하"));
    }
}
