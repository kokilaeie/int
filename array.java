import java.io.*;
import java.util.*;
class array
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
boolean b=false;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{
b=true;
}
}
if(b==true)
{
System.out.println(a[i]);
break;
}
}
}
}
