package etc.exception.basic;

import java.util.Scanner;

public class TryCatchExample {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("정수 1: ");
        int i = scan.nextInt();
        System.out.println("정수 2: ");
        int j = scan.nextInt();


        try {
            // try 블록에는 예외 발생 가능성이 있는 코드를 배치합니다.
            System.out.printf("%d / %d = %d\n", i, j, i / j);
        } catch (Exception e) {
            // catch 블록에는 try에서 실제 예외가 발생했을 시
            // 실행할 내용을 작성합니다.
            System.out.println("0으로 나눌 수 없습니다!");
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료!");
        scan.close();
    }
}
