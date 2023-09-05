package BackjunMunjae.OneWeeks;

import java.util.Scanner;
public class Star_13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int all = num*2-1;

        int a=1;

        boolean check = true;

        for(int j=0; j<all; j++)
        {
            for(int i=0;i<num;i++)
            {
                if(i<a)
                {
                    System.out.print("*");
                }
                else
                {
                }

            }
            if(a==num)
            {
                 check =false;
             }

            if(check) {
                a++;
            }
            else
            {
                a--;
            }

            System.out.println();

        }



    }
}
