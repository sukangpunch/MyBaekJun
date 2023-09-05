package BackjunMunjae.FiveWeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SerialNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        StringBuffer sb = new StringBuffer();

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num;i++)
        {
            list.add(br.readLine());
        }

        for(int i=0; i<num;i++)
        {
            for(int j=i+1;j<num;j++)
            {
                if(list.get(i).length() > list.get(j).length())
                {
                    String tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,tmp);
                }
                else if(list.get(i).length() == list.get(j).length())
                {
                    int cnt1 =0;
                    int cnt2 =0;

                    for(int k=0;k < list.get(i).length();k++)
                    {
                        if(list.get(i).charAt(k) < 58)
                        {
                            cnt1 +=list.get(i).charAt(k) - '0';
                        }

                        if(list.get(j).charAt(k) < 58)
                        {
                            cnt2 +=list.get(j).charAt(k) - '0';
                        }
                    }

                    if(cnt1 > cnt2)
                    {
                        String tmp = list.get(i);
                        list.set(i,list.get(j));
                        list.set(j,tmp);
                    }
                    else if(cnt1 == cnt2)
                    {
                        for(int k=0; k<list.get(i).length(); k++)
                        {
                            if(list.get(i).charAt(k)-'a' > list.get(j).charAt(k)-'a')
                            {
                                String tmp = list.get(i);
                                list.set(i,list.get(j));
                                list.set(j,tmp);
                                break;
                            }
                            else if(list.get(i).charAt(k)-'a' <list.get(j).charAt(k)-'a')
                            {
                                break;
                            }

                        }
                    }
                }
            }

        }

        for(String val : list)
        {
            sb.append(val).append('\n');
        }

        System.out.println(sb);



    }
}
