package Graphs;

import java.util.*;
public class AdjacencyList 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int vertices=sc.nextInt();
		int edges=sc.nextInt();
		sc.nextLine();
		Map<Character,LinkedList<Character>> map=new HashMap<Character, LinkedList<Character>>();
		for(int i=0;i<vertices;i++)
		{
			map.put((char)(i+65), new LinkedList<Character>());	
		}
		for(int i=0;i<edges;i++)
		{
			String s=sc.nextLine();
			char a=s.charAt(0);
			char b=s.charAt(2);
			
			LinkedList<Character> list1=map.get(a);
			list1.add(b);
			map.put(a, list1);
			
			LinkedList<Character> list2=map.get(b);
			list2.add(a);
			map.put(b, list2);
		}
		for(int i=0;i<vertices;i++)
		{
			System.out.println(map.get((char)(i+65)));
		}
	}
}

/*
 Input
5
7
A B
A E
B C
B E
B D
C D
D E
------------------
Output
[B, E]
[A, C, E, D]
[B, D]
[B, C, E]
[A, B, D]
*/
