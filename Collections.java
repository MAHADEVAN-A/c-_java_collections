import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Collections {
	public static void main(String[] args) {
		//primitive type conversion
		//boxing and unboxing
		//converting to string using primitiveReference and toString method
		//by using parseReference method converting primitive to string

		//length - array length() - string
		//isEmpty() isBlank()-true if empty spaces are there
		//charAt()

		//getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)
		//toCharArray()
		//getBytes()
		//equals(), hashCode(), equalsIgnoreCase()
		//compareTo() compareToIgnoreCase() - lexigographical conversion
		//startsWith() endsWith()
		//indexOf(string or char, int from position to search for)
		//lastIndexOf() same as above except the last occurence is returned
		//substring(), subSequence(int,int)
		//concat()
		//matches() - used for regex
		//Arrays.toString(array[]) - [,,,]

		// replace(char oldChar, char newChar)
		// replaceFirst(String regex, String replacement)
		// replaceAll(String regex, String replacement)
		// replace(CharSequence target, CharSequence replacement)
		// contains()
		// String.join(",", "A", "B", "C");
		// split(String regex, int limit)

		//toLowerCase() toUpperCase()
		//trim() strip() valueOf() repeat()


		// jshell> String str = "Hi\nHello\nYes\r\nNo\n";
		// str ==> "Hi\nHello\nYes\r\nNo\n"
		 
		// jshell> List lines = new ArrayList();
		// lines ==> []
		 
		// jshell> str.lines().forEach(s -> lines.add(s));
		 
		// jshell> System.out.println(lines);
		// [Hi, Hello, Yes, No]


		//Arrays.asList(arr)
		//Arrays.sort(arr)
		//Arrays.binarySearch(arr,ele)
		//Arrays.copyOf(arr,ind) .copyOfRange(Arr,start,end)
		

		//Creating ArrayList from array
		// Integer a[] = {1,2,3,4,5};
		// ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(a));

		// for (int i = 0; i < list.size(); i ++) {
		//     System.out.print(list.get(i) + " ");
		// }

		//check if an array has certain value
		// String[] arr = {"hello","maha","deva"};
		// boolean res = Arrays.asList(arr).contains("deva");
		// System.out.println(res);

		//concatenate two arrays
		// int[] intArray = { 1, 2, 3, 4, 5 };
		// int[] intArray2 = { 6, 7, 8, 9, 10 };
		// // Apache Commons Lang library
		// int[] combinedIntArray = Arrays.addAll(intArray, intArray2);
		// System.out.println(Arrays.toString(combinedIntArray));

		// ArrayList<String> arr = new ArrayList<String>();
		//add() size() get() remove() set()
		// arr.add("hello");
		// arr.add("hell");
		// arr.add("maha");
		// arr.set(1, "Welcome");
		// arr.remove("maha");
		// for (int i = 0; i < arr.size(); i ++) {
		//     System.out.print(arr.get(i) + " ");
		// }

		// get(index)	access a data inside list in specific index
		// add(data)	insert a data into the list
		// remove(index)	remove a data inside list in specific index
		// add(index, data)	insert a data into the list in specific index
		// set(index, data)	edit or update a data in specific index
		// isEmpty()	check if a list is empty
		// size()	get the size or length of the list

		//List<String> names = new ArrayList<>();
		//Set<data_type> set_name = new HashSet<>();
		// add(data)	insert a data
		// remove(data)	remove a specific data
		// isEmpty()	check if a Set is empty
		// size()	get the size or length of the Set

		// Map<key_data_type, value_data_type> map_name = new HashMap<>();
		// Map<String, Integer> scores = new HashMap<>();

        // insert some data
        // scores.put("Joe", 88);
        // scores.put("Zoe", 70);
        // scores.put("Riccardo", 90);

        // get the value from key named "Joe"
        // System.out.println("The Joe's score is: " + scores.get("Joe"));

        // retrieve all the keys
        // Collection<String> names = scores.keySet();
        // for (String name: names) {
        //     System.out.println(name);
        // }

        // retrieve all the values
        // Collection<Integer> collectedScores = scores.values();
        // for (int score: collectedScores) {
        //     System.out.println(score);
        // }

		// Iterator it = hs.iterator();
		// while(it.hasNext())
		// {
		// 	System.out.print(it.next()+" ");
		// }

	}
}