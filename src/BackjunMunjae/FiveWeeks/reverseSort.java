package BackjunMunjae.FiveWeeks;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class reverseSort {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(scanner.next());
        long arr[] = new long[num];

        for(int i=0; i<num; i++)
        {
            String str = scanner.next();
            String reverse="";

            if(str.length()>1)
            {
                for(int j=str.length(); j>0 ;j--)
                {
                    String ch = str.substring(j-1,j);
                    if(reverse.equals("") && ch.equals("0"))
                    {

                    }
                    else {
                        reverse = reverse + ch;
                    }

                }
                arr[i] = Long.parseLong(reverse);
            }
            else{
                arr[i] = Long.parseLong((str));
            }
        }

        Arrays.sort(arr);

        for(long val : arr)
        {
            bw.write(val + "\n");
        }

        bw.close();
    }
}
