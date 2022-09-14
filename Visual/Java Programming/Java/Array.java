import java.util.*;
import java.io.*;
class Array
{
public static void main(String st[])throws IOException
{
int a[]=new int[10];
int sum=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(int i=0;i<a.length;i++)
{
try
{
System.out.println("enter the element"+(i+1));
a[i]=Integer.parseInt(br.readLine());
sum=sum+a[i];
}

catch(NumberFormatException ne)
{
i--;
System.out.println("Invalid input"+ne.getMessage());
}
}
System.out.println("Sum is="+sum);
double e=0;
int flag=0;
while(flag==0)
{
System.out.println("Enter the divide element:");
int b=Integer.parseInt(br.readLine());
try
{
 e=sum/a[b-1];
flag=1;
}
catch(NumberFormatException ae)
{
System.out.println("Invalid input");
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("Beyound the limit");
}
catch(ArithmeticException ai)
{
System.out.println("can't divide by zero");
}
finally
{
System.out.println("HU TO AVISH");
}
}
System.out.println("Divide is:"+e);

} }