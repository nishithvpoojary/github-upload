package practice;
public class LargestNumberInArray {
	

	public static void main(String[] args) {
		int num[]= {1,-28,88,200,7};
		int minNum=num[0];
		  for(int i=0;i<num.length;i++) 
		  { 
			  if(num[i]>minNum) 
			  {
				  minNum=num[i];		  
			  }			  
		  }System.out.println(minNum);
	}
}
