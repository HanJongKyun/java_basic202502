package oop.static_.practice;

public class Main {
/*
#### 구현할 사항
    - `Product` 클래스와 `Store` 클래스를 구현합니다.
    - `Main` 클래스에서 여러 제품의 판매를 시뮬레이션하고, 판매 후의 총 판매액을 출력하여 시스템의 작동을 확인합니다.
*/

    public static void main(String[] args) {
        Product product1 = new Product("노트북", 1000000);
        Product product2 = new Product("스마트폰", 500000);

        product1.sellProduct();
        product2.sellProduct();

        System.out.println("총 판매액: " + Store.getTotalSales());
    }
}
