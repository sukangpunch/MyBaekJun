package BackjunMunjae.TwoWeeks;

import java.util.Scanner;
public class reversSentence {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String sent = scanner.nextLine();
            int num = sent.length();
            int num2 =num-1;

            if(sent.equals("***"))break;

            for(int i=0;i<num;i++)
            {
                System.out.print(sent.charAt(num2));
                num2 -=1;

            }
            System.out.println();

        }


    }
}
