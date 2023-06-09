package week3.day1.sat;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		int length = text1.length();
		int length2 = text2.length();
		if (length==length2) {
			System.out.println("Length are same");
		}
		char[] t1 = text1.toCharArray();
		char[] t2 = text2.toCharArray();
		Arrays.sort(t1);
		Arrays.sort(t2);
		if (Arrays.equals(t1, t2)) {
			System.out.println("its an anagram");
		}else {
			System.out.println("its not an anagram");
		}
		}
}
