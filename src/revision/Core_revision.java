package revision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

public class Core_revision {
	public static void main(String[] args)

	{
		String arr[]= {"firefox","chrome","opera","safari"};
		String s[]=new String[4];
		String names[][]=new String[3][2];
		
		s[0]="chiru";
		s[1]="ramesh";
		s[2]="mahesh";
		s[3]="saibharath";
		names[0][0]= "ram";
		names[0][1]="seetha";
		names[1][0]="hanuma";
		names[1][1]="vihari";
		names[2][0]="laxman";
		names[2][1]="urmila";
		Object o[][]= {{"orange",120,120.00},{"sam",143,143.00}};
		
		for (int i = 0; i < s.length; i++) 
		{
			System.out.println( "the dost names are "+s[i]);
			System.out.println(arr[i]);
			System.out.println(names[2][1]);
			System.out.println(o[1][1]); 
			
		}
Set<Integer>		 set= new HashSet<Integer>();
set.add(1);
set.add(4);
set.add(3);  
set.remove(3);
for (Integer i : set) 
{
	System.out.println(i);
	
	
}
Set<String> set2=new TreeSet<String>();
set2.add("carrot");
set2.add("bringel");
set2.add("finger");
set2.remove("finger");
for (String string : set2) {
	System.out.println(string);
}
Hashtable<Integer, String> hash=new Hashtable<Integer, String>();
hash.put(415, "chiru");
hash.put(416,"lavanya");
hash.put(417, "jeevan");
hash.put(418, "akhil");
hash.put(439, "satyeshwar");
for (int i=415; i<=439;i++)
{
	String s1=hash.get(i);
	
	System.out.println(s1);
}
		
		
		
	
				
	}
}
  