import java.io.*;
import java.util.*;
class three
{
public static void main(String []args)
{
Scanner s=new Scanner(String.in)
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.next();
}
int b[]=new int[50];
int x=0;
int k=s.nextInt();
for(int i=a.length-1;i>=k;i--)
{
b[x++]=a[i];
}
for(int i=0;i<k;i++)
{
b[x++]=a[i];
}
for(int i=0;i<x;i++)
{
System.out.println(b[i]+(i<x-1?",":""));
}
}
}
