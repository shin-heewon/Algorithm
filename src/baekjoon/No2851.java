package baekjoon;

import java.util.Scanner;

public class No2851 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int num = 100;
        int max = 0;

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(num >= Math.abs(100-sum)){
                num = Math.abs(100-sum);
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
