package week3.day1.sat;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Test ="changeme";
		char[] ch1 = Test.toCharArray();
		for (int i=0;i<ch1.length;i++) {
			if (i%2==0) {
				ch1[i]=Character.toUpperCase(ch1[i]);
				System.out.print(ch1[i]);
			}else {
				System.out.print(ch1[i]);
				
			}
			
		}
	}

}
