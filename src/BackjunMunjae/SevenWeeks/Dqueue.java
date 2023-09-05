package BackjunMunjae.SevenWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Dqueue {
    private static LinkedList<Integer> list;

    public static void push_back(int value){
        list.addLast(value);
    }

    public static void push_front(int value){
        list.addFirst(value);
    }

    public static int pop_back(){
        if(list.isEmpty())
        {
            return -1;
        }

        return list.removeLast();
    }

    public static int pop_front(){
        if(list.isEmpty())
        {
            return -1;
        }

        return list.removeFirst();
    }

    public static int size(){
        return list.size();
    }

    public static int empty(){
        if(list.isEmpty())
        {
            return 1;
        }else{
            return 0;
        }
    }

    public static int front(){
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
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());

        list = new LinkedList<>();

        for(int i=0; i<num;i++)
        {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken())
            {
                case "push_front": push_front(Integer.parseInt(st.nextToken()));break;
                case "push_back": push_back(Integer.parseInt(st.nextToken()));break;
                case "pop_front": sb.append(pop_front()).append("\n");break;
                case "pop_back": sb.append(pop_back()).append("\n");break;
                case "size": sb.append(size()).append("\n");break;
                case "empty": sb.append(empty()).append("\n");break;
                case "front": sb.append(front()).append("\n");break;
                case "back": sb.append(back()).append("\n");break;
            }

        }

        System.out.println(sb);

    }
}
