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

        int correctCount = 0; // 정답 횟수
        int wrongCount = 0;   // 오답 횟수

        while (true) {
            // 1~100 사이의 난수 2개 생성
            int num1 = (int) (Math.random() * 100 + 1);
            int num2 = (int) (Math.random() * 100 + 1);
            int operator = (int) (Math.random() * 4);  // 0 ~ 3
            int correct = 0;

            switch (operator) {
                case 0:
                    System.out.printf("%d + %d = ???\n", num1, num2);
                    correct = num1 + num2;
                    break;
                case 1:
                    System.out.printf("%d - %d = ???\n", num1, num2);
                    correct = num1 - num2;
                    break;
                case 2:
                    System.out.printf("%d x %d = ???\n", num1, num2);
                    correct = num1 * num2;
                    break;
                case 3:
                    System.out.printf("%d / %d = ???\n", num1, num2);
                    correct = num1 / num2;
                    break;
            }
            System.out.print("> ");
            int anwer = scan.nextInt();
            
            if(anwer == correct){
                System.out.println("정답입니다!");
                correctCount++;
            }
            else if(anwer == 0){
                System.out.println("종료합니다.");
                break;
            }
            else{
                System.out.println("틀렸습니다.");
                wrongCount++;
            }
        }
        // 정답 및 오답 횟수 출력
        System.out.println("===================================================");
        System.out.println("정답 횟수: " + correctCount + "회");
        System.out.println("오답 횟수: " + wrongCount + "회");

    }
}
