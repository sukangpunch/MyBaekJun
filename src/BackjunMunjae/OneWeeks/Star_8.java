package BackjunMunjae.OneWeeks;

import java.util.Scanner;
public class Star_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int front= 1;
        int rear= num*2-2;
        boolean check =true;

        for(int j=0; j<num*2-1;j++) {
            for (int i = 0; i < num * 2; i++) {
                if (i < front) {
                    System.out.print("*");
                } else if (i > rear) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            if(front == rear || front > rear)
            {
                check = false;
            }

            if(check) {
                front = front + 1;
                rear = rear - 1;
            }
            else
            {
                front = front - 1;
                rear = rear +1 ;
            }

            System.out.println();
        }

    }
}
