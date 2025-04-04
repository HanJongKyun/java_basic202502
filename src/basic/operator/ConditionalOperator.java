package basic.operator;

public class ConditionalOperator {
    public static void main(String[] args) {

        /*
             # 3항 연산자
             - 피 연산자(연산을 당하는 값)가 3개인 연산자를 말합니다.
             - (조건식 ? 좌항 : 우항);
             - 조건식을 비교하여 true일 경우에는 좌항이,
              false일 경우에는 우항의 값이 도출됩니다.
        */

        int x = 50, y = 30;

        String result = (x > y ? "x는 y보다 크다." : "x는 y보다 작다.");
        System.out.println("reust = " + result);
        
        // 연산자의 우선순위
        // 괄호 -> 참조(.) -> 단항 -> 이항 -> 삼항 -> 대입

        // 난수(랜덤값)를 발생시키는 메서드 Math.random();
        // 0.0 이상 1.0 미만의 실수 난수값을 반환해 줍니다. 0.0 <= x < 1.0

        double rn = Math.random();
        System.out.println("rn = " + rn);

        // 1 ~ 10까지의 정수 난수를 발생
        for(int i = 0; i < 10; i++) {
            int rn2 = (int) (Math.random() * 10 + 1);
            System.out.println("rn2 = " + rn2);
        }
    }
}
