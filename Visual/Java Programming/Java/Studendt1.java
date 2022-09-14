import java.util.*;
class Student1
{ 
public static void main(String st[])
{
int r,c,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Enter no. of row");
r=sc.nextInt();
int a[][]=new int[r][];

for( i=0;i<a.length;i++)
{
System.out.println("Enter no. of columns");
 c=sc.nextInt();
a[i]=new int[c];
for(j=0;j<a[i].length;j++)
{
System.out.println("enter elelment");
a[i][j]=sc.nextInt();
}
}


for(i=0;i<a.length;i++)
{
for(j=0;j<a[i].length;j++)
{
System.out.print("\t enter element is"+a[i][j]);
}
System.out.println(" ");
}
}}