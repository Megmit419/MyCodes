import java.util.Scanner;
import java.util.Arrays;
class StringSort
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String s="";
        String y[]=n.split(" ");
        for(i=0;i<y.length;i++)
        {
            Arrays.sort(y);
        s=s+y[i]+" ";
        }
        System.out.println(s);
    }
}