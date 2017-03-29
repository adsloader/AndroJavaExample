package 순수자바트레이닝.다섯째날_클래스.개념예제.기초1;

import java.util.ArrayList;
public class 상품관리 {
    ArrayList<상품> 리스트 = new ArrayList();
    public void 제품추가(상품 인){
        리스트.add(인);
    }

    public void 제품삭제(String name){
        for (int i =0; i < 리스트.size(); i++){
            상품 손님 = 리스트.get(i);
            if(손님.이름얻기().equals(name)){
                리스트.remove(i);
                break;
            }
        }
    }

    public int 제품찾기(String name){
        for (int i =0; i < 리스트.size(); i++){
            상품 제품 = 리스트.get(i);
            if(제품.이름얻기().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public 상품 가져오기(int 순서){
        return 리스트.get(순서);
    }

    public int 제품개수(){
        return 리스트.size();
    }
}
