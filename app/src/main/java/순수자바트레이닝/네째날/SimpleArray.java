package 순수자바트레이닝.네째날;

public class SimpleArray {
    public static void main(String[] args) {

        // 1. int형 데이터 5개를 초기화한 배열 -> data
        int data[] = {1, 2, 3, 5};
        System.out.println(data[2]);
        System.out.println(data.length);

        // String형 데이터를 담을 수 있는 배열 -> aata2
        // 값이 없으므로 크기도 알 수 없음
        String data2[];

        // String형 데이터를 담을 수 있는 비어있는 배열 ->data2
        // 값이 없으므로 크기도 알 수 없음.
        String data3[] = new String []{"A", "B"};
        System.out.println(data3.length);
        for(int i = 0; i <data3.length; i++){
            System.out.println(data3[i]);
        }
    }
}
