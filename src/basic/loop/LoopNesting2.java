package basic.loop;

public class LoopNesting2 {
    public static void main(String[] args) {

     /*
         *
         **
         ***
         ****
         *****
                */

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================================");

        /*
             *
            **
           ***
          ****
         *****
                 */

        System.out.println("======================================");

        for(int i = 1; i <= 5 ; i++){
            for(int k = 4; k >= i ; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================================");

     /*   *****
           ****
            ***
             **
              *
                   */

        System.out.println("======================================");

        for(int i = 5; i >= 1 ; i--){
            for(int k = 4; k >= i ; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
