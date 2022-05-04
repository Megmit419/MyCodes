import java.util.Scanner;
class StringHighestLength
{
    public static void main(String args[])
    {
        int i,m,max=0,index=-1;
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        String y[]=n.split(" ");
        for(i=0;i<y.length;i++)
        {
            m=y[i].length();
            if(m>max)
            {
                index=i;
                max=m;
            }
        }
        System.out.println(y[index]);
    }
}