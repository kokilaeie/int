import java.io.*;
import java.util.*;
class map
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
String ss=s.next();
String a[]=new String[ss.length()];
Map<String,Integer> m=new LinkedHashMap<String,Integer>();
for(int i=0;i<a.length;i++)
{
m.put(a[i],m.get(a[i]==null?1:m.get(a[i])+1);
}
List<String> li=new ArrayList<String>(m.keySet());
for(String i:li)
{
if(m.get(i)==1)
{
System.out.println(i);
break;
}
}
}
}
