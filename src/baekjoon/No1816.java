package baekjoon;

import java.util.Scanner;

public class No1816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[sc.nextInt()];
        String[] result = new String[arr.length];

        boolean flag = false;

        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextLong();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=2; j<=1000000; j++){
                if(arr[i]%j==0){
                    //result[i]="NO";
                    flag = true;
                    break;
                }
            }
//            if(result[i]==null || result[i].equals("")){
//                result[i]="YES";
//            }
            System.out.println(!flag?"YES":"NO");
            flag = false;
        }


//        for(int i=0; i<arr.length; i++){
//            System.out.println(result[i]);
//        }

    }
}
