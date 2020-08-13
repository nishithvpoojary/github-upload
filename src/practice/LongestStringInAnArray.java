package practice;

public class LongestStringInAnArray {

	public static void main(String[] args) {
		String arr[]= {"hey","stay","chair","day"};
		String b = null;
		System.out.println(arr.length);
		int min=arr[0].length();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>min)
			{
				min=arr[i].length();
				b=arr[i];
			}
		}
		
		System.out.println("Longest String in the array = "+b);
		System.out.println("length of the longest String = "+min);
		
	}
}
