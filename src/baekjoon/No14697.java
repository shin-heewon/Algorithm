package baekjoon;

import java.util.Scanner;

public class No14697 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int students = sc.nextInt();

        int rest = 0;
        boolean flag = true;
        int res = 0;

        while(flag){
            if(students % a == 0){
                //System.out.println(1);
                res = 1;
                flag = false;
            }else{
                rest = students%a;
                if (rest%b==0){
                    //System.out.println(1);
                    res = 1;
                    flag = false;
                }else {
                    rest = rest%b;
                    if (rest%c == 0){
                        //System.out.println(1);
                        res = 1;
                        flag = false;
                    }//else System.out.println(0);
                }
            }

            if(students % b == 0 && rest==0){
                //System.out.println(1);
                res = 1;
                flag = false;
            }else{
                rest = students%b;
                if (rest%a==0){
                    //System.out.println(1);
                    res = 1;
                    flag = false;
                }else {
                    rest = rest%a;
                    if (rest%c == 0){
                        //System.out.println(1);
                        res = 1;
                        flag = false;
                    }//else System.out.println(0);
                }
            }

            if(students % c == 0 && rest == 0){
                //System.out.println(1);
                res = 1;
                flag = false;
            }else{
                rest = students%c;
                if (rest%b==0){
                    //System.out.println(1);
                    res = 1;
                    flag = false;
                }else {
                    rest = rest%b;
                    if (rest%a == 0){
                        //System.out.println(1);
                        res = 1;
                        flag = false;
                    }else{
                        //System.out.println(0);
                        flag = false;
                    }

                }
            }
        }

        System.out.println(res);


    }
}
