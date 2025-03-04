package oop.poly.practice;

class ComputerPart {

/*
1. **기본 클래스 `ComputerPart` 정의**
    - 속성:
        - `partName` (부품 이름, 문자열)
        - `partPrice` (부품 가격, 정수형)
        - 메소드: `describePart()`: 부품의 이름과 가격을 출력합니다.
*/

    protected String partName;
    protected int partPrice;

    public ComputerPart(String partName, int partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    public void describePart() {
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }
}