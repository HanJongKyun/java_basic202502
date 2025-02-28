package oop.inherit;

public class Main {
    public static void main(String[] args) {

        Warrior w1 = new Warrior("dd");
     /*   w1.nickName = "전사짱짱맨";*/

        w1.showStatus();

        Mage m1 = new Mage("Han");
        m1.showStatus();
    }
}
