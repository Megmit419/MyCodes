import java.util.Scanner;
class StringBuffer1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        String y=sb.toString();
        if(s.equals(y))
        {
        System.out.println(s);
        }
    }
}