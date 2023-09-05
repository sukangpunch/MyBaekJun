package BackjunMunjae.NineWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;

public class FindSosuSumMin {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Vector<Integer> vt = new Vector<>();

        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());
        int sum =0;

        for(int i=min;i<=max;i++)
        {
            boolean check = true;

            if(i==1)check = false;

            for(int j=2; j<i;j++)
            {
                if(i % j == 0)
                {
                    check = false;
                }
            }

            if(check)
            {
                vt.add(i);
                sum +=i;
            }
        }

        if(vt.isEmpty())
        {
            sb.append(-1);
        }else
        {
            int minValue = Collections.min(vt);
            sb.append(sum).append("\n").append(minValue).append("\n");
        }

        System.out.println(sb);

    }
}
