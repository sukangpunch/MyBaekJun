package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class balanceStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true)
        {
            String str = br.readLine();

            if(str.equals("."))
            {
                break;
            }

            sb.append(solve(str)).append("\n");
        }
        System.out.println(sb);
    }

    public static String solve(String str){

        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);

            if(ch == '(' || ch == '['){
                    st.push(ch);
            }
            else
            {
                switch (ch){
                    case ')': if(st.isEmpty() || st.peek() !='('){
                        return "no";
                    }else
                    {
                        st.pop();
                    }
                    break;

                    case ']': if(st.isEmpty() || st.peek() !='['){
                        return "no";
                    }else
                    {
                        st.pop();
                    }
                    break;
                }
            }
        }

        if(st.isEmpty()){
            return "yes";
        }
        else{
            return "no";
        }

    }
}
