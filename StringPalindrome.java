import java.util.Scanner;
class StringPalindrome
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String y[]=n.split(" ");
        for(i=0;i<y.length;i++)
        {
            StringBuffer sb=new StringBuffer(y[i]);
            sb.reverse();
            String x=sb.toString();
            if(y[i].equals(x))
            {
                System.out.println(y[i]);
            }
        }
    }
}