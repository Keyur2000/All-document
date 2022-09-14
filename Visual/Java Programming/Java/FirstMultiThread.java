class Child extends Thread
{
int j;
Thread th=Thread.currentThread();
Child()
{
 start();
}
public void run()
{
 for(j=10;j>=1;j--)
  {
     System.out.println(":"+j);
     try
       {
         Thread.sleep(1000);
        }
     catch(Exception e)
       {}
   }
}
}

public class FirstMultiThread
{
  public static void main(String st[])
{
  Thread.currentThread();
  
  new Child();
  for(int i=0;i<10;i++)
  {
    System.out.println(""+i);
    try{Thread.sleep(1000); }
    catch(Exception e){ }
   }

}}     