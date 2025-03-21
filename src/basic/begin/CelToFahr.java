package basic.begin;

import java.util.Scanner;

public class CelToFahr {
    public static void main(String[] args) {

         /*
             사용자에게 섭씨온도를 입력받아서
             화씨온도로 변환하여 출력하는 로직을 작성하세요.
             변환공식은 저도 몰라요. 여러분들이 찾아서 적용해 주셔야 합니다.
             화씨 온도는 소수점 첫째 자리까지 표현해 주시기 바랍니다.
             # ㄹ 한자 7 -> (℃),   ㄹ 한자 다음장 4 -> (℉)
        */

        Scanner scan = new Scanner(System.in);
        double Cel;
        double Fahr;

        System.out.print("섭씨 온도 입력(℃): ");
        Cel = scan.nextDouble();

        Fahr = Cel * 9.0 / 5 + 32;

        System.out.printf("섭씨 온도: %.1f℃\n", Cel);
        System.out.printf("화씨 온도: %.1f℉", Fahr);

        scan.close();
    }
}
