package level_2;

import java.util.Scanner;

public class level2_6_2525 {
public static void main(String[] args){
//    KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다. 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
//    그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다.
//    또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
//    훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
            // 시작시간, 필요한시간(분단위) -> 오븐구이가 끝나는 시각
            Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    int duration = sc.nextInt();

    // 24시간 = 24*60 = 1440분

   int originTime =  (h*60) + m;
   int resultTime = originTime + duration;
   int finalTime;
// 걸리는 시간이 많을 수도 있움 % 1440 해야함!!!
       finalTime =  resultTime % 1440;

   int time1 = finalTime/60;
   int time2 = finalTime%60;
    System.out.print(time1+ " "+ time2);



}
}
