public class FirstTh

{
public static void main(String st[])
{
Thread th=Thread.currentThread();
System.out.println("\n NAME:"+th.getName());
//th.setName("KEYUR");
System.out.println("\n NAME:"+th.getName());
System.out.println("\n NAME:"+th.isAlive());
for(int i=0;i<=10;i++)
{
System.out.println(" "+th.getName()+"=  "+i);
try
{
th.sleep(2000);
}
catch(Exception e)
{}
}
System.out.println("\n AFTE= IS ALIVE:"+th.isAlive());
}
}