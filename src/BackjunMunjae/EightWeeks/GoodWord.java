package BackjunMunjae.EightWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class GoodWord {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        cnt =0;

        for( int i=0; i<num;i++){
            String str = br.readLine();
            GoodCheck(str);
        }
        System.out.println(cnt);
    }
    static void GoodCheck(String str){
        if(str.length()%2 !=0)return;

        Stack<Character> st = new Stack<>();
        st.push(str.charAt(0));
        for(int i=1; i<str.length();i++)
        {
            if(!st.isEmpty() && st.peek() == str.charAt(i)){
                st.pop();
            }else{
                st.push(str.charAt(i));
            }
        }
        if(st.isEmpty())cnt++;
    }
}
