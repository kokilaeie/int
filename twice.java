import java.io.*;
import java.util.*;
class twice
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
Map<Integer,Integer> m=new LinkedHashMap<Integer,Integer>();
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=s.nextInt();
for(int i=0;i<n;i++)
{
m.put(a[i],m.get(a[i]==null?1:m.get(a[i])+1);
}
List<Integer> li=new ArrayList<Integer>(m.keySet());
for(int i:li)
{
if(m.get(i)==1)
System.out.println(m);
}
}
}
