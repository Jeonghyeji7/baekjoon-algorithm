package level_2;

import java.util.Scanner;

public class level2_3_2753 {
public static void main(String[] args){
//    연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
//    윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
//    예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 하지만, 2000년은 400의 배수이기 때문에 윤년이다.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    int result = a % 4;
    int result2 = a % 100;

    int result3 = a % 400;

    if((result == 0 && result2 != 0) || result3 == 0){
        System.out.println(1);
    }else {
        System.out.println(0);
    }
}
}
