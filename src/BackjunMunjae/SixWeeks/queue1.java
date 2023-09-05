package BackjunMunjae.SixWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;
public class queue1 {

    private static Vector<Integer> vt = new Vector<>();
    public static void push(int n)
    {
        vt.add(n);
    }

    public static int pop()
    {
        if(vt.isEmpty())
        {
            return -1;
        }
        int n = vt.get(0);
        vt.remove(0);
        return n;
    }

    public static int size(){
        return vt.size();
    }

    public static int empty(){
        if(vt.isEmpty())
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static int front()
    {
        if(vt.isEmpty())
        {
            return -1;
        }

        return vt.get(0);
    }

    public static int back(){
        if(vt.isEmpty())
        {
            return -1;
        }

        return vt.get(vt.size()-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num;i++)
        {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            switch (st.nextToken())
            {
                case "push": push(Integer.parseInt(st.nextToken()));break;
                case "pop" : System.out.println(pop());break;
                case "size": System.out.println(size());break;
                case "empty": System.out.println(empty());break;
                case "front": System.out.println(front());break;
                case "back" : System.out.println(back());break;
            }

        }

    }
}
