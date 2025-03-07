package oop.poly.practice;

// 부품 관리 클래스 Computer
class Computer {
 /*
 3. **부품 관리 클래스 `Computer` 생성**
    - 속성:
        - `parts`: 컴퓨터 부품 객체들을 관리하는 `ComputerPart[]`.
    - 메소드:
        - `addPart(ComputerPart part)`: 컴퓨터에 부품을 추가합니다.
        - `showParts()`: 컴퓨터의 모든 부품 설명을 출력합니다.
*/

    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        ComputerPart[] temp = new ComputerPart[parts.length + 1];
        for (int i = 0; i < parts.length; i++) {
            temp[i] = parts[i];
        }
        temp[temp.length - 1] = part;
        parts = temp;
    }

    public void showParts() {
        // 모든 부품 정보 출력
        for (ComputerPart part : parts) {
            part.describePart();
        }
    }
}