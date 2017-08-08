package 순수자바트레이닝.네째날;

/**
 * Created by snake on 17. 3. 27.
 */
public class MyArray {
    String data[]    = null;
    int    nAddIndex = 0;

    public static void main(String[] args) {
        MyArray arr = new MyArray(10);
        for(int i =0; i < 10; i++){
            arr.add("index" + i);
        }

        System.out.println(arr.get(3));
        arr.delete();
        System.out.println(arr.get(9));
        System.out.println(arr.get(8));
    }
    
    public MyArray(int nSize){
        setSize(nSize);
    }

    // 찾기
    public int find(){
        for(int i = 0; i <data.length; i++){
            return i;
        }
        return  -1;
    }

    private void setSize(int nSize) {
        data = new String[nSize];
    }

    // 가져오기
    public String get(int nIndex){
        return data[nIndex];
    }

    // 추가하기(맨뒤만)
    public void add(String s){
        data[nAddIndex] = s;
        nAddIndex++;
    }

    // 지우기(맨뒤만)
    public void delete(){
        nAddIndex--;
        data[nAddIndex] = null;
    }
}
// 미션 1:
// public void add(String s) 메소드를 구현할 때
// 맨뒤가 아닌 맨앞에 추가하도록 구현해본다.
// (고민하는 것조차 도움이 된다)
