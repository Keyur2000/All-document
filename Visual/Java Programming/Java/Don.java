import java.util.*;
class Don
{
public static void main(String st[])
{
ArrayList<Integer> t=new ArrayList<Integer>();
t.add(5);
t.add(6);
t.add(7);
t.add(-8);
boolean x=t.contains(5);
boolean y=t.contains(0);
System.out.println(x);
System.out.println(y);

t.size();
int r=t.size();
System.out.println(r);
System.out.println(t);
/*t.clear();
System.out.println(t);*/
t.subList(1,3);
System.out.println(t.subList(1,3));

}}