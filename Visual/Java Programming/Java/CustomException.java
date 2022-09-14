import java.util.*;
imoprt java.lang.*;
class NegativeAmountException extends Exception
{
double amount;
NegativeAmountException(double d)
{
amount=d;
}
public String toString()
{
return "Negative Amount"+amount+"Has been caught";
}
}
print(hello)


public class CustomException
{
public static void main(String st[])
{
Scanner sc=new Scanner(System.in);
double amt=0;
System.out.println("ENTER AMOUNT");
amt=sc.nextDouble();


try
{
if(amt<0)
{
throw new NegativeAmountException(amt);
}
else
{
System.out.println("ENJOY");
}
}
catch(NegativeAmountException ne)
{
System.out.println(ne);
}

}}