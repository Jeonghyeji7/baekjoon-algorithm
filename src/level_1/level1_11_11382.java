package level_1;

import java.util.Scanner;
//A, B, C (1 ≤ A, B, C ≤ 1012)
// 클래스 네임을 Main으로 해서 제출해야 컴파일 에러가 안난다
public class level1_11_11382 {
    public static void main(String[] args){
        System.out.println("꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!");

      long input;
        long input2;
        long input3;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLong();
        input2 = sc.nextLong();
        input3 = sc.nextLong();

        System.out.println(input+input2+input3);

    }
}

// long..