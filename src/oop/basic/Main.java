package oop.basic;

public class Main {
    public static void main(String[] args) {

        /*
        설계도에 작성한 속성과 기능을 사용하려면
        반드시 실체(객체)를 생성하셔야 합니다.
        클래스만 제작된 채로는 아무 기능도 수행할 수 없습니다.
        */

        Pen redpen = new Pen();
        Pen bluepen = new Pen();

        // 참조 연산자(.)를 통해 객체로 접근한 후
        // 속성을 지정하고 기능을 사용할 수 있습니다.
        redpen.color = "빨강";
        bluepen.color = "파랑";

        redpen.write();
        bluepen.write();

        redpen.priceInfo();
        bluepen.priceInfo();

        System.out.println("redpen = " + redpen);
        System.out.println("bluepen = " + bluepen);

    }
}
