package basic.constate;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("성별을 입력하세요. (M/F)");
        String gender = scan.next();

            switch (gender) {
                // java 14버전 이후 개선된 switch 문
                case "M", "m", "ㅡ":
                    System.out.println("남자");
                    break;
                case "F": case "f": case "ㄹ":
                    System.out.println("여자");
                    break;
                default: // case를 설정하지 않은 값들은 모두 default로 빠집니다.
                    System.out.println("잘못 입력.");
            }
        scan.close();
    }
}
