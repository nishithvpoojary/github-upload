package practice;
class Teacher
{
	String subject;
	String standard;
	void insert(String sub, String stan)
	{
		subject=sub;
		standard=stan;
	}
	void display()
	{
		System.out.println(subject +" "+standard);
	}
}
public class test2 {
	public static void main(String[] args) 
	{
		Teacher t1=new Teacher();
		Teacher t2=new Teacher();
		t1.insert("English","fifth" );
		t2.insert("Kannada","sixth" );
		t1.display();  
		t2.display();  

	}
}
