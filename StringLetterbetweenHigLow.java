import java.util.Scanner;
import java.util.Arrays;
class StringLetterbetweenHigLow
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(i=0;i<s.length();i++)
        {
            Arrays.sort(s);
            System.out.println(s);
        }
    }
}