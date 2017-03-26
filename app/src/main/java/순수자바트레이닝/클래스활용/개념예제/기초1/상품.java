package 순수자바트레이닝.클래스활용.개념예제.기초1;

/**
 * Created by park on 2016-08-17.
 */
public class 상품 {
    private String name;

    public 상품(String name){
        정보입력(name);
    }
    public void 정보입력(String name){
        this.name = name;
    }

    public String 이름얻기(){
        return this.name;
    }

}
