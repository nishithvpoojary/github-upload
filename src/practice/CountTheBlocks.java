package practice;

public class CountTheBlocks {
	
	public static int countBlocks(int levels){
	    int total = 0;
	    
	    for(int i=1;i<=levels;i++)
	    {
	        total=total+(i*i);
	       
	    }

	    return total;
	}

	public static void main(String[] args) {
		System.out.println("Total ="+countBlocks(4));

	}

}
