package basic.constate;

import java.util.Scanner;

public class IfQuiz {
    public static void main(String[] args) {

        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
          마지막에 한번에 출력하시면 되겠습니다.
        */

        Scanner scan = new Scanner(System.in);

        System.out.print("정수1 :");
        int num1 = scan.nextInt();
        System.out.print("정수2 :");
        int num2 = scan.nextInt();
        System.out.print("정수3 :");
        int num3 = scan.nextInt();

        int max = 0;
        int min = 0;
        int mid = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
            }
        }
        else if (num2 > num1 && num2 > num3) {
            max = num2;
            if (num1 > num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        }
        else {
            max = num3;
            if (num2 > num1) {
                mid = num2;
                min = num1;
            } else {
                mid = num1;
                min = num2;
            }
        }

        System.out.println("======================================================================");
        System.out.println("max = " + max + ", mid = " + mid + ", min = " + min);
    }
}
