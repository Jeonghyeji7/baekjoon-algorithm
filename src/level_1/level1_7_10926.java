package level_1;

import java.util.Scanner;

// 클래스 네임을 Main으로 해서 제출해야 컴파일 에러가 안난다
public class level1_7_10926 {
    public static void main(String[] args){
        System.out.println("준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.");
      String name;

        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println(name + "??!");

    }
}