package 순수자바트레이닝.둘째날;

public class 별피라미드{
    public static void main(String[] args) {
        String star = "";
        for(int i = 0; i < 10; i++){
            star = star + "*";
            System.out.println(star);  
        }
    }
}


// 힌트: Scanner()
// 미션 1:
// 피라미드를 반대로 만들어본다.
// 제일 긴 변을 처음에 출력하도록 한다.
// **********
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *