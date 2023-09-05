package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StackExam {
    static java.util.Stack<Integer> stack;

    static void push(int n)
    {
        stack.push(n);
    }

    static int pop()
    {
        if(stack.isEmpty())
        {
            return -1;
        }

        return stack.pop();
    }

    static int size()
    {
        return stack.size();
    }

    static int empty()
    {
        if(stack.isEmpty())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    static int top()
    {
        if(stack.isEmpty())
        {
            return -1;
        }

        return stack.peek();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        stack = new java.util.Stack<>();

        for(int i=0; i<num; i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();

            switch (str1)
            {
                case "push": push(Integer.parseInt(st.nextToken()));break;
                case "pop": sb.append(pop()).append("\n");break;
                case "size": sb.append(size()).append("\n");break;
                case "empty": sb.append(empty()).append("\n");break;
                case "top": sb.append(top()).append("\n");break;
            }

        }

        System.out.println(sb);
    }
}
