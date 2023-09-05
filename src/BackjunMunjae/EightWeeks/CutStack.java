package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class CutStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        int cnt = 0;

        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch == '('){
                st.push(ch);
                continue;
            }
            if(ch == ')'){
                st.pop();

                if(str.charAt(i-1) == '(')
                {
                    cnt +=st.size();
                }
                else{
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        br.close();
    }
}
