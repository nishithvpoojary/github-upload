package practice;

import java.util.ArrayList;

public class ArrayListUserDefind {

	public static void main(String[] args) {
		
		Students s1=new Students(1,"arun");
		Students s2=new Students(2,"varun");
		ArrayList<Students> arr= new ArrayList<Students>();
		arr.add(s1);
		arr.add(s2);
		
System.out.println(arr);
for(String str:arr)
{
	System.out.println(str);
}
	}

}
