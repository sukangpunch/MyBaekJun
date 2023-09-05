package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSort1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int [] arr = new int [num];

        for(int i=0; i<num; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=0; i<num;i++)
        {
            for(int j=i+1; j<num; j++)
            {
                if(arr[i]>arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }

        for(int i=0; i<num;i++)
        {
            System.out.println(arr[i]);
        }


    }
}
