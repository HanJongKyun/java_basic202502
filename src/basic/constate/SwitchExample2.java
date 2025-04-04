package basic.constate;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scan.nextInt();
        int result = score/10;

        switch (result){
            case 10:
                if(score>100) {
                    System.out.println("잘못된 점수 입니다.");
                    break;
                }
            case 9:
                System.out.println("당신의 학점은 A 입니다.");
                break;
            case 8:
                System.out.println("당신의 학점은 B 입니다.");
                break;
            case 7:
                System.out.println("당신의 학점은 C 입니다.");
                break;
            case 6:
                System.out.println("당신의 학점은 D 입니다.");
                break;
            default:
                if (score > 100 || score < 0){
                    System.out.println("잘못된 점수입니다.");
                }
                else {
                    System.out.println("당신의 학점은 F 입니다.");
                }
        }

        scan.close();
    }
}
