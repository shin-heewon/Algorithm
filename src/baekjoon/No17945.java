package baekjoon;

import java.util.Scanner;

public class No17945 {

  public static void main(String[] args) {

    //x2  + 2Ax + B = 0 의 두 계수 A, B가 주어진다. A, B는 정수이며, 이 방정식의 근은 항상 정수이다. (-1000 ≤ A, B ≤ 1000)
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    for(int i = -1000; i<=1000; i++){
      if(((i*i) + (2*a*i)+ b)==0){
        System.out.print(i+" ");
      }
    }


  }

}