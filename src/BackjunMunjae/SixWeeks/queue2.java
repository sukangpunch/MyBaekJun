package BackjunMunjae.SixWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class queue2 {
   private static LinkedList<Integer> list;

    public static void push(int num){
        list.add(num);
    }

    public static int pop()
    {
        if(list.isEmpty())
        {
            return -1;
        }

        return list.pop();
    }

    public static int size(){

        return list.size();
    }

    public static int empty(){
        if(list.isEmpty())
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
        if(list.isEmpty())
        {
            return -1;
        }
            return list.getFirst();
    }

    public static int back(){
        if(list.isEmpty())
        {
            return -1;
        }

            return list.getLast();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        list = new LinkedList<Integer>();
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            String str = br.readLine();

            StringTokenizer st = new StringTokenizer(str," ");

            switch (st.nextToken())
            {
                case "push": push(Integer.parseInt(st.nextToken()));break;
                case "pop": sb.append(pop()).append("\n"); break;
                case "size": sb.append(size()).append("\n");break;
                case "empty": sb.append(empty()).append("\n");break;
                case "front": sb.append(front()).append("\n");break;
                case "back" : sb.append(back()).append("\n");break;
            }
        }

        System.out.println(sb);
    }
}
