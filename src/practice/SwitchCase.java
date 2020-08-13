package practice;

public class SwitchCase {

	public static void main(String[] args) {
		String week="thursday";
		String gym;
		switch(week) 
		{
		case "monday": gym="chest";
		break;
		case "tueday": gym="bicep";
		break;
		case "wedday": gym="shoulder";
		break;
		case "thursday": gym="lat";
		break;
		case "friday": gym="legs";
		break;
		default : gym= "holiday";
		}
		System.out.println(gym);
	}
}
