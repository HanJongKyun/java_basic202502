package basic.begin;
// 1. Scanner 로딩 (제공되는 Scanner 클래스 정보를 현재 클래스로 가져오기)
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // 2. Scanner 객체를 생성.
        Scanner scan = new Scanner(System.in);

 /*
             3. Scanner의 함수들을 이용하여 데이터를 입력받을 수 있습니다.
             - next(): 공백이 없는 문자열을 입력받습니다.
             - nextLine(): 공백을 포함한 문자를 입력받습니다.
             - next + 기본타입이름(): 해당 타입에 맞는 데이터를 입력받습니다.
             ex)
                nextInt(): 정수 데이터를 입력받습니다.
                nextDouble(): 실수 데이터를 입력받습니다.
        */

        String name;
        int age;

        System.out.print("이름 :");
        name = scan.nextLine();

        System.out.print("나이 : ");
        age = scan.nextInt();

        System.out.printf("제 이름은 %s이고, 나이는 %d세 입니다.\n", name ,age);

        // 4. Scanner 객체를 반납
        // 객체를 반납 -> Scanner 객체를 메모리에서 해제.

        scan.close();
    }
}
