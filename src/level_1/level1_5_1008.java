package level_1;

import java.util.Scanner;

// 클래스 네임을 Main으로 해서 제출해야 컴파일 에러가 안난다
public class level1_5_1008 {
    public static void main(String[] args){
        System.out.print("첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.");
        int a;
        int b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        // 형변환 이용해서 정수를 실수로 변환
        System.out.print((double) a /b);
    }
}
// 나누기 연산자 유의 할점
// 정수/정수의 경우 소수점 아래까지 계산하지 않고 끝남
// 정수/실수 , 실수/정수 , 실수/실수  - 리터럴 접미사 이용 (f,d) or 형변환(casting)연산자를 이용