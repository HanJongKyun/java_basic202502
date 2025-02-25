package basic.array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayQuiz01 {
    public static void main(String[] args) {

         /*
            # 음식명을 입력받아서 배열에 순서대로 저장하는 코드
            1. 음식명을 입력받는다.
            2. 음식명에 '그만'이 입력되었는가?
            2-1. 그만이 입력되었으면 종료한다.
            2-2. 그만이 입력되지 않았으면 배열에 넣는다.
            3. 배열의 크기를 1 증가시킨다.
            4. 기존의 음식데이터를 증가된 새 배열에 복사한다.
            5. 새로운 음식명을 마지막 위치에 추가한다.
         */

        Scanner scan = new Scanner(System.in);
        String[] foods = {};

        while (true) {
            System.out.print("음식명을 입력하세요 ('그만' 입력 시 종료): ");
            String input = scan.next();

            if (input.equals("그만")) {
                break;
            }

            // 1. 기존 배열보다 1개 더 큰 새로운 배열 생성
            String[] temp = new String[foods.length + 1];

            // 2. 기존 데이터 복사
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }

            // 3. 새로운 음식 추가
            temp[temp.length - 1] = input;

            // 4. 배열 주소 변경 후 temp 초기화
            foods = temp;
            temp = null;
        }

        scan.close();

        System.out.println("입력된 음식 목록: " + Arrays.toString(foods));
    }
}
