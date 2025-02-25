package basic.loop;

import java.util.Scanner;

public class LoopNestingQuiz {
    public static void main(String[] args) {

           /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int num = scan.nextInt();

        int primeCount = 0; // 소수 개수 카운트

        System.out.print("소수: ");

        // 2부터 입력받은 숫자까지 반복
        for (int i = 2; i <= num; i++) {
            boolean isPrime = true; // 소수 판별

            // 2부터 i의 제곱근까지 나눠서 소수인지 판별
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) { // 나누어 떨어지면 소수가 아님
                    isPrime = false;
                    break;
                }
            }

            // 소수라면 출력 및 개수 증가
            if (isPrime) {
                System.out.print(i + " ");
                primeCount++;
            }
        }

        System.out.println("\n소수의 개수: " + primeCount + "개");

        scan.close();

    }
}
