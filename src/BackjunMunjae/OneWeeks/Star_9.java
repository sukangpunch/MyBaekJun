package BackjunMunjae.OneWeeks;

import java.util.Scanner;
public class Star_9 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int num = scanner.nextInt();

            int all = num*2-1;
            int front = 0;
            int rear = all-1;
            boolean check = true;

            for (int j=0; j<all;j++)
            {
                for(int i=0; i<all;i++)
                {
                    if(i<front)
                    {
                        System.out.print(" ");
                    }
                    else if(i>rear)
                    {

                    }
                    else{
                        System.out.print("*");
                    }
                }
                if(front == rear)
                {
                    check = false;
                }
                if(check) {
                    front += 1;
                    rear -= 1;
                }
                else
                {
                    front -=1;
                    rear +=1;
                }
                System.out.println();

            }
    }
}
