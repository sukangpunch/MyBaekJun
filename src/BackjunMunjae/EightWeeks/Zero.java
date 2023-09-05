package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            int value = Integer.parseInt(br.readLine());

            if(value == 0)
            {
                st.pop();
            }
            else
            {
                st.push(value);
            }
        }

        int result = 0;
        while(!st.isEmpty())
        {
            result +=st.pop();
        }

        System.out.println(result);
    }
}
