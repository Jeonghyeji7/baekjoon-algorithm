package level_1;

import java.util.Scanner;

// 클래스 네임을 Main으로 해서 제출해야 컴파일 에러가 안난다
public class level1_6_10869 {
    public static void main(String[] args){
        System.out.print("두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. ");
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        // 형변환 이용해서 정수를 실수로 변환
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a /b);
        System.out.println(a %b);
    }
}