package practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArratListForLoopExample {

	public static void main(String[] args) {
		ArrayList<String> arr= new ArrayList<String>();
		arr.add("hari");
		arr.add("bari");
		arr.add("fari");
System.out.println(arr);
for(String str:arr)
{
	System.out.println(str);
}

	}

}
