import java.util.Scanner;
class ATM
{
      public static void main(String args[])
      {
      Scanner sc=new Scanner(System.in);
      float witdraw=sc.nextFloat();
      float total=sc.nextFloat();
      float f=0.5f;
      if(witdraw%5==0 && total>witdraw+f)
      {
            System.out.println(total-witdraw-f);
      }
      else{
            System.out.println(total);
      }
      }
}