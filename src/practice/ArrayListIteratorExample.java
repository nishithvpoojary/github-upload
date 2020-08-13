package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("hari");
		arr.add("bari");
		arr.add("fari");
System.out.println(arr);
Iterator itr=arr.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
