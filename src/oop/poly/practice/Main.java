package oop.poly.practice;

public class Main {

/*
    #### 구현할 사항
    - `ComputerPart` 클래스와 그 서브 클래스들을 구현합니다.
    - `Computer` 클래스에서 부품 관리 기능을 구현합니다.
    - `Main` 클래스에서 컴퓨터 부품을 추가하고, 모든 부품의 정보를 출력하는 시뮬레이션을 실행합니다.
*/
    public static void main(String[] args) {
        Computer myComputer = new Computer();
        myComputer.addPart(new Processor("Intel i7", 320000));
        myComputer.addPart(new Memory("Corsair Vengeance 16GB", 90000));
        myComputer.addPart(new HardDrive("Samsung SSD 1TB", 150000));

        myComputer.showParts();
    }
}