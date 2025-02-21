package basic.begin;

public class Identifier {
    public static void main(String[] args) {
        /*1. 식별자는 대/소문자를 철저하게 구분함!*/
        int age = 35;
        /*int age = 40;(X)*/
        int Age = 40;

       /* 2. 식별자는 숫자로x*/


      /*  3. 식별자에 공백 못들어감!*/
//        int my birth day = 12313;
        int myBirthday = 19921013; // camel case

       /* 4. 식별자에 특수기호는 밑줄(__), 달러기호($) 뿐입니다.*/
        /*사용 권장 X. 이미 사용하기로 약속한 곳 있음.*/
        String $hello = "안녕";

        /*5. 키워드 (예약어)는 식별자로 사용할 수 없음!*/
        /*키워드란 이미 어떠한 기능을 내포하고 있는 단어*/
//        String class ="8반"; (X)
        String Class ="8반"; // 권장 X
        String classNumber = "8반";

        /*6. 한글이나 한자 같은 식별자도 문법적으로 허용하기는 함..*/
        /*권장 X*/
        int 숫자 = 10;
        int sagwa = 20; // 권장 x
    }
}
