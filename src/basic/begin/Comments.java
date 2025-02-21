package basic.begin;
import java.util.*;

public class Comments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scan.next();

        System.out.println("나이: ");
        int age = scan.nextInt();

       /* System.out.println("주소: ");
        String address = scan.next();*/

        System.out.println("이름: " + name +" 나이: " /*+ " 주소: " + address*/ );

    }
}
