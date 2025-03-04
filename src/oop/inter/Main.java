package oop.inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 인터페이스와 구현체 간에도 다형성 발생이 가능합니다.
//        GameController keyboard = new KeyboardController();
//        GameController joystick = new JoystickController();
//        GameController touchScreen = new TouchScreenController();

        GameController gc;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("게임을 플레이 할 도구를 선택하세요.(0 누르면 종료)");
            System.out.println("1. 키보드 | 2. 조이스틱 | 3. 터치스크린");
            System.out.print("> ");
            int menu = scan.nextInt();
            if(menu == 0){
                System.out.println("종료.");
                break;
            } else if (menu == 1) {
                gc = new KeyboardController();
            } else if (menu == 2) {
                gc = new JoystickController();
            } else {
                gc = new TouchScreenController();
            }

            gc.moveCharacter(" 위");
            gc.action();
            gc.pause();
            System.out.println("===========================================");
        }
    }
}
