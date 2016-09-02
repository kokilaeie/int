import java.io.*;
import java.util.*;
class subset
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a1[]=new int[n];
int n1=s.nextInt();
int a2[]=new int[n1];
for(int i=0;i<n;i++)
{
a1[i]=s.nextInt();
}
for(int j=0;j<n1;j++)
{
a2[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n1;j++)
{
if(a1[i]==a2[j])
{
c++;
}
}
}if(c>0)
{
System.out.println(c);
}
}
