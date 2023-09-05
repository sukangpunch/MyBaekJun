package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.Vector;

public class StackSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        Vector<Integer> vt = new Vector<>();

        for(int i=1; i<=num;i++)
        {
            vt.add(i);
        }

        boolean check = false;
        for(int i=0; i<num;i++) {
            int n = Integer.parseInt(br.readLine());

            while(true){
                if(st.isEmpty()){
                    st.push(vt.remove(0));
                    sb.append("+").append("\n");
                }
                else if(st.peek() < n)
                {
                    st.push(vt.remove(0));
                    sb.append("+").append("\n");
                }
                else if(st.peek() == n)
                {
                    st.pop();
                    sb.append("-").append("\n");
                    break;
                }
                else{
                    check =true;
                    break;
                }
            }
        }
        if(check){
            sb.delete(0,sb.length());
            sb.append("NO").append("\n");
        }
        System.out.println(sb);

    }
}
