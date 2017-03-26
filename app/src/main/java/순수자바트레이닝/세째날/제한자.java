package 순수자바트레이닝.세째날;
public class 제한자 {
    public static void main(String[] args) {
        사람 박씨 = new 사람("박커필드", "구들");
        System.out.println(박씨.이름 + "은 " + 박씨.회사명 + " 직원.");
        //System.out.println(박씨.nickname + "은 " + 박씨.이름 + "의 별명 .");
        System.out.println(박씨.getNickname() + "은 " + 박씨.이름 + "의 별명 .");
    }
}

class 사람{
    public  String 이름;
    public  String 회사명;
    private String nickname;
    private int 월급;

    public 사람(String 이름, String 회사명){
        // 관행적인 표현
        this.이름     = 이름;
        this.회사명   = 회사명;
        this.nickname = 회사명 + "의 사축:" + 이름;
    }

    public String getNickname(){
        return this.nickname;
    }
}
