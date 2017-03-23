package 순수자바트레이닝.첫날;
// 문자열은 ==와 같은 연산자로 비교해서는 안된다.
// String 클래스의 equals() 메소드를 이용한다.
// equals()에 비교하고자 하는 문자열을 넣으면
// String과 같은 값이면 true 아니면 false를 넘겨준다.
public class if문예제2 {
    public static void main(String[] args) {
        String s1 = "AAAA";
        String s2 = "AAAA";
        String s3 = new String("AAAA");

        // 좋은 개발환경은 아래에 경고를 보낸다 .
        if (s1 == s2) {
            System.out.println("s1 == s2 same");
        }

        // 좋은 개발환경은 아래에 경고를 보낸다 .
        if (s2 == s3) {
            System.out.println("s1 == s3 same");
        }

        // 18번 라인의 비교문에서 재대로된 결과값을 얻으려면
        // if(s2 == s3){ 부분을
        // if(s2.equals(s3)){ 처럼 바꾸어 사용해야 한다.
    }
}
