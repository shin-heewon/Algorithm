package baekjoon;

import java.util.Scanner;

public class No16283 {

  public static void main(String[] args) {

    //양 a그램, 염소 b그램, 양+염소=n마리, 양+염소 먹는 양=w
    //양과 염소가 각각 몇 마리인지를 구하는 프로그램

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    int w = sc.nextInt();

    int count = 0;
    int lamb = 0;
    int goat = 0;


    //양 i, 염소 j,,i+j=n, i*a+j*b=w
    for(int i=1; i<=1000; i++){
      for(int j=1; j<=1000; j++){
        if (i + j == n && i * a + j * b == w) {
          count++;
          lamb = i;
          goat = j;
        }
      }
    }

    if (count == 1) {
      System.out.println(lamb + " " + goat);
    } else {
      System.out.println(-1);
    }

  }
}
