package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No2309 {
    public static void main(String[] args) {

        int [] arr = new int[9];
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(sum-arr[i]-arr[j] == 100){
                    arr[i]=0;
                    arr[j]=0;
                    Arrays.sort(arr);
                    for(int a=2; a<arr.length; a++){
                        System.out.println(arr[a]);
                    }
                    break;
                }
            }
        }



    }
}
