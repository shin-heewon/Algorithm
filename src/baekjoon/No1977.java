package baekjoon;

import java.util.Scanner;

public class No1977 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = 0;
        int count = 0;

        for(int i=m; i<=n; i++){
            double num = Math.sqrt((double) i);
            if(i-(int)num*(int)num==0){
                if(count == 0){
                    min = i;
                }
                count++;
                sum+=i;
            }
        }

        if(count!=0){
            System.out.println(sum);
            System.out.println(min);
        }else System.out.println(-1);

    }
}
