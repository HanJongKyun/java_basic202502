package oop.fieldlocal;

public class FieldAndLocal {

    // 필드는 값을 초기화 하지 않아도
    // 객체 생성 시, 각 타입의 기본값으로 자동 초기화 됨.
    int aaa;

    void foo2(){
        System.out.println("aaa = " + aaa);
//        System.out.println("bbb = " + bbb); (x)
    }

    // ccc : 매개 변수 (parameter) - 메서드 호출 시 반드시 필요한 인자를 받는 변수 (지역변수)
    void foo(int ccc){
        // 지역변수. 메서드 내에서 생성된 변수
        // 해당 지역에서만 유효한 변수. 해당 블록이 끝나면 메모리에서 소멸.
        int bbb = 20;

        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("ccc = " + ccc);
    }
}
