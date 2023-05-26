package week1.day1;

public class Mobile {
	public void Makecall()
	{ 
		String Mobilemodel = "oppo f11 pro";
		float Mobileweight = 13.5f;
		System.out.println("My Mobile Model is"+ " " + Mobilemodel);
		System.out.println("My Mobile weight is" + " "+ Mobileweight);
		System.out.println("Make call to 97907");	
	}
	public void sendMsg()
	{
		boolean Isfullcharged=true;
		int Mobilecost = 15000;	 
		System.out.println("My Mobile is Fully Charged-" +" "+
		Isfullcharged+ "  ");
		System.out.println("My Mobile Cost is Rs"+" "+Mobilecost);
		System.out.println("send message to 90038");
	}
				
public static void main(String[] args) {
			Mobile a = new Mobile();	
			a.Makecall();
			a.sendMsg();
		System.out.println("This is my mobile");
		}
}
