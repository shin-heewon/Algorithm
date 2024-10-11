package baekjoon;

import java.util.Scanner;

public class No14568 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 1;//영훈
        int b = a+2;//남규
        int c = num-a-b;//택희

        int count = 0;

        for(int i=0; i<=100; i++){
            b = a+2;
            for(int j=0; j<=100; j++){
                c = num-a-b;
                for(int k=0; k<=100; k++){
                    if(c%2==0 && num==a+b+c && c>=2){
                        count++;
                    }
                    c++;
                }
                b++;
            }
            a++;
        }

        System.out.println(count!=0?count:0);

    }
}
