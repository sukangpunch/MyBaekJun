package BackjunMunjae.FiveWeeks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class WordsSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        String []arr= new String[num];

        for(int i=0; i<num;i++)
        {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length())
                {
                    return s1.compareTo(s2);
                }
                else
                {
                    return s1.length() - s2.length();
                }
            }
        });
        String before="";
        for(String val : arr)
        {
            if(before.equals(val))
            {

            }
            else
            {
                before=val;
                sb.append(val).append('\n');
            }
        }
        System.out.println(sb);

    }
}
