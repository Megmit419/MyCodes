import java.util.Scanner;
import java.util.ArrayList;
public class Test1
{
    public static void main(String[] args)
    {
        int i,j;
        ArrayList<Integer> l=new ArrayList<Integer>();
        ArrayList<Integer> l1=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            int a=sc.nextInt();
            if(a==-1)
            break;
            l.add(a);
        }
        for(i=0;i<=l.size();i++)
        {
            for(j=i+1;j<=l.size();j++)
            {
                l1.add(l.get(i),l.get(j));
            }
        }
        System.out.println(l1);
    }
}