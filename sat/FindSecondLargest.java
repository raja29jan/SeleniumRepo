package week3.day1.sat;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {3,2,11,4,6,7};
		Arrays.sort(num);
		int sl=num[num.length-2];
		System.out.print("Second largest number"+" "+sl);
	}
}