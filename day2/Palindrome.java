package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=64346;
		int number=num;
		int temp=0;
		for (int i=1;i<=5;i++)
		{
			temp=temp*10+num%10;
			num=num/10;
		}
		if (number==temp) {
			System.out.println("palindrome number");
		}else
		System.out.println("not a palindrome number");
	}

}
