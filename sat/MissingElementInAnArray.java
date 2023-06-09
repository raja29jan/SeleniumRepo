package week3.day1.sat;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,7,6,8};
		Arrays.sort(array);
		for (int i=array[0];i<=array[array.length-1];i++) {
			if (i!=array[i-array[0]]) {
				System.out.println("Missing number:"+i);
				break;
			}
				
			}
	}

}
