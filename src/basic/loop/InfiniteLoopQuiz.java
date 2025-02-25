package basic.loop;

import java.util.Scanner;
import java.util.Random;

public class InfiniteLoopQuiz {
    public static void main(String[] args) {

         /*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		  지속적으로 문제를 출제한 후 정답을 입력받으세요.
		  사용자가 0을 입력하면 반복문을 탈출시키세요.

		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int correctCount = 0; // 정답 횟수
        int wrongCount = 0;   // 오답 횟수

        while (true) {
            // 1~100 사이의 난수 2개 생성
            int num1 = rand.nextInt(100) + 1;
            int num2 = rand.nextInt(100) + 1;
            int correctAnswer = num1 + num2;


            System.out.println(num1 + " + " + num2 + " = ???");
            System.out.println("정답을 모르면 0을 입력하세요.");
            System.out.print("> ");
            int userAnswer = scan.nextInt();

            // 0 입력 시 종료
            if (userAnswer == 0) {
                System.out.println("종료.");
                break;
            }

            // 정답 체크
            if (userAnswer == correctAnswer) {
                System.out.println("정답!");
                correctCount++;
            } else {
                System.out.println("틀림! 정답은 " + correctAnswer + "입니다.");
                wrongCount++;
            }
        }

        scan.close();

        // 정답 및 오답 횟수 출력
        System.out.println("정답 횟수: " + correctCount);
        System.out.println("오답 횟수: " + wrongCount);
    }
}
