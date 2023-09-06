package BackjunMunjae.OneWeeks;

import java.util.Scanner;

//***** 백준 - No.2675 - *****
public class Star_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int all = 2*num-1;
        int a=0;
        int b=0;
        int c=all-1;
        for(int i=0; i<num;i++)
        {
            for(int j=0; j<all;j++) {

                if(j<a){
                    System.out.print(" ");
                }
                else if(j>c)
                {

                }
                else{
                    System.out.print("*");
                }
            }
            a = a+1;
            b = b+1;
            c = c-1;
            System.out.println();
        }

    }
}
