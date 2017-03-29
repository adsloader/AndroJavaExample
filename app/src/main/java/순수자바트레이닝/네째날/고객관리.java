package 순수자바트레이닝.네째날;

import java.util.ArrayList;

public class 고객관리 {
    ArrayList <사람3> 리스트 = new ArrayList<>();

    public void 고객추가(사람3 인 ){
        리스트.add(인);
    }

    public void 고객삭제(String name){
        for(int i = 0; i < 리스트.size(); i++){
            사람3 고객 = 리스트.get(i);
            if(고객.이름얻기().equals(name)){

                리스트.remove(i);
                break;
            }
        }
    }

    public int 고객찾기(String name){
        for(int i = 0; i < 리스트.size(); i++){
            사람3 고객 = 리스트.get(i);
            if(고객.이름얻기().equals(name)){
                return i;
            }
        }

        return -1;
    }

    public int 고객개수(){
        return  리스트.size();
    }
}
