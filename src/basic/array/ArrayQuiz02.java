package basic.array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayQuiz02 {
    public static void main(String[] args) {

         /*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		 - 추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.
		 */

        Scanner scan = new Scanner(System.in);

        String[] friends = {"무지", "네오", "어피치", "라이언", "춘식이"};
        System.out.println("현재 친구 목록: " + Arrays.toString(friends));
        while (friends.length > 0) {
            // 현재 친구 목록 출력

            System.out.print("삭제할 친구 이름을 입력하세요 ('그만' 입력 시 종료): ");
            String name = scan.next();

            if (name.equals("그만")) {
                System.out.println("삭제후 친구 목록: " + Arrays.toString(friends));
                break;
            }

            // 삭제할 친구 찾기
            int index = -1;
            for (int i = 0; i < friends.length; i++) {
                if (friends[i].equals(name)) {
                    index = i;
                    break;
                }
            }

            // 삭제할 친구가 목록에 없는 경우
            if (index == -1) {
                System.out.println(name + " 라는 이름이 없습니다.");
                continue;
            }

            // 새로운 배열 생성 (크기 -1)
            String[] temp = new String[friends.length - 1];

            // 기존 배열 데이터를 새 배열로 복사 (삭제할 요소 제외)
            for (int i = 0, j = 0; i < friends.length; i++) {
                if (i == index) continue; // 삭제할 요소는 복사 안 함
                temp[j++] = friends[i];
            }

            friends = temp;
            temp = null;

            // 배열이 비었는지 확인
            if (friends.length == 0) {
                System.out.println("더 이상 삭제할 친구가 없습니다. 프로그램을 종료합니다.");
                break;
            }
            System.out.println("삭제후 친구 목록: " + Arrays.toString(friends));
        }

        scan.close();
    }
}
