package basic.casting;

public class CastingExample3 {
    public static void main(String[] args) {

        char c = 'B';
        int i = 2;

        // 서로 다른 타입간의 연산은 작은 쪽이 큰 쪽을 따라감.
        int intResult = c + i;
        char charResult = (char) (c + i);
        System.out.println("charResult = " + charResult);
        System.out.println("intResult = " + intResult);
        /// //////////////////////////////////////////////////////////////

        int k = 10;
        double d = (double) k / 4;
        System.out.println("d = " + d);

    }
}
