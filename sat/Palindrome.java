package week3.day1.sat;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "madam";
		String name1="";
		for (int i=name.length()-1;i>=0;i--) {
			name1+=name.charAt(i);
		}
		if(name.equals(name1)) {
			System.out.println("String is Palindrome");
		}else {
		System.out.println("String is not a palindrome");
		}
	}

}
