package 순수자바트레이닝.네째날;

public class 사람3 {
    private String name;
    private int    age;

    public 사람3(int age, String name){
        정보입력(age, name);
    }

    public void 정보입력(int age, String name){
        this.name = name;
        this.age  = age;
    }

    public String 이름얻기(){
        return  this.name;
    }

    public int 나이얻기(){
        return  this.age;
    }
}
