class Test
{
static int p=10;
int q=1;
int fun()
{
p++;q++;
return ++p;
}
public static void main(String st[])
{
Test t1=new Test();
for(int i=0;i<3;i++)
System.out.println(t1.fun());
System.out.println(t1.fun());
}
}