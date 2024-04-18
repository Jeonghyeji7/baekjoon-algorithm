package level_1;

import java.util.Scanner;

// 클래스 네임을 Main으로 해서 제출해야 컴파일 에러가 안난다
public class level1_9_10430 {
    public static void main(String[] args){
        System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
        System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");
        System.out.println("세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.");
      int input;
int input2;
int input3;
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.nextInt();
        System.out.println((input+input2)%input3);
        System.out.println((input%input3)+(input2%input3));
        System.out.println((input+input2)%input3);

    }
}