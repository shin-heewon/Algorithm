package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No2875 {
    public static void main(String[] args) {
        //여학생 n, 남학색 m, 미참가 인원 k
        //여학생 2, 남학생 1로 이루어진 팀 조합 개수 구하기

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[10000];
        int count = 0;


        for(int i=0; i<=k; i++){
            for(int j=0; j<=k-i; j++){
                if(i+j==k && n-i>=2 && m-j>=1){
                    if(m-j < (n-i)/2){
                        arr[count]= m-j;
                        count++;
                    }else if(m-j>= (n-i)/2){
                        arr[count] = (n-i)/2;
                        count++;
                    }
                }
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }
}
