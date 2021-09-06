// import java.util.LinkedHashSet;// 
import java.util.HashSet;
import java.util.Set;
// import java.util.Scanner;
// import java.util.Iterator;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
// import java.util.ArrayList;
import java.util.Queue;
// import java.util.Arrays;
import java.util.LinkedList;
// import java.util.Stack;

public class Main
{
	public static void main(String args[])throws Exception
	{
		// Scanner sc = new Scanner(System.in);
		BufferedReader inp = new BufferedReader(
			new InputStreamReader(System.in));
		//HashSet - uses hashing, LinkedHashSet - uses linked list
		// LinkedHashSet<Integer> hs = new LinkedHashSet<>();// also HashSet

		// System.out.println(hs.add(1));   //true
		// System.out.println(hs.remove(1));//true
		// System.out.println(hs.contains(1));//false
		// System.out.println(hs.isEmpty());//true

		// hs.add(2);
		// hs.add(3);
		// System.out.println("hashset is "+hs);
		// System.out.println(hs.size());//2

		// hs.clear();

		// System.out.println(hs.size());//0

		// for(int i=1;i<=5;i++)
		// hs.add(Integer.valueOf(sc.next()));

		// valueOf - returns Integer obj of string contains int.
		// parseInt - returns int  of string contains int.
		// toString - returns String of Integer obj.
		// toBinaryString, toHexString, toOctalString

		// Stack<Integer> st = new Stack<>();

		// System.out.println(st.push(5));
		// System.out.println(st.push(6));

		// int element = Integer.parseInt(inp.readLine());
		// System.out.println(st.push(element));

		// st.push(sc.nextInt());
		// Integer obj = st.pop();
		// System.out.println(obj);

		// System.out.println("The stack is "+st);
		// System.out.println(st.peek());

		// System.out.println(st.search(5));
		// System.out.println(st.search(6));
		// System.out.println(st.search(7));

		// LinkedList<String> ll = new LinkedList<>();
		// ll.add("maha");  // true if successfull
		// ll.add("Siva");
		// ll.add("Ramu");
		// ll.add("Golu");
		// ll.add("lala");
		// ll.add("maha");

		// System.out.println("LinkedList is "+ll);

		// System.out.println(ll.indexOf("maha"));
		// System.out.println(ll.lastIndexOf("maha"));

		// ll.set(0,"deva");
		// ll.remove(4);

		// ll.add(1,"hari");

		// System.out.println("LinkedList is "+ll);

		// ll.addFirst("nama");
		// ll.addLast("nama");

		// System.out.println("LinkedList is "+ll);

		// ll.removeFirst();
		// System.out.println("LinkedList is "+ll);

		// ll.removeLast();
		// System.out.println("LinkedList is "+ll);

		// ll.remove(3);
		// System.out.println("LinkedList is "+ll);

		// System.out.println(ll.getFirst()+ll.getLast());


		// ArrayList<Integer> al = new ArrayList<>();

		// al.add(1);
		// al.add(2);
		// al.add(3);
		// al.add(3);
		// al.add(5);
		// al.add(5,6);
      
		// System.out.println("Arraylist is "+al);

		// al.remove(Integer.valueOf("5"));
		// System.out.println("Arraylist is "+al);

		// System.out.println("The element at 4 position is "+al.get(4));

		// System.out.println("Arraylist is "+al);
		// System.out.println(al.indexOf(3));
		// System.out.println(al.lastIndexOf(3));
		// System.out.println("Size is "+al.size());

		// Queue<Integer> q = new LinkedList<>();

		// q.offer(1); //also add() but it returns exception when it fails to add
		// q.offer(2);
		// q.offer(3);

		// System.out.println("Size is "+q.size());
		// System.out.println("The queue is "+q);

		// q.remove(); // or poll() but it returns no exception only boolean, removes first element
		//q.poll() returns null if queue is empty
		// System.out.println("The queue is "+q);

		//clear() isEmpty()

		//To retrieve an element without deleting it, we can use element() or peek()
		//element() it returns exception when queue is empty

		// System.out.println("The queue is "+q);
		// System.out.println("The queue is "+q);

		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("maha",21);
		hm.put("siva",17);
		hm.put("hari",21);

		int age = hm.get("maha");
		System.out.println(age);

		//clear() isEmpty() size() 


		System.out.println("hashmap is "+hm);

		Set<String> set = new HashSet<String>();

		set = hm.keySet();

		System.out.println("set is "+set);
		// System.out.println("hashmap is "+hm);

		// Iterator it = hs.iterator();
		// while(it.hasNext())
		// {
		// 	System.out.print(it.next()+" ");
		// }

	}
}