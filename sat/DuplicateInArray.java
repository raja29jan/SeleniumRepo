package week3.day1.sat;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int length = num.length;
		System.out.println("Length of the array:"+length);
		for (int i=0;i<num.length-1;i++) {
			int count=0;
			for (int j=i+1;j<num.length;j++) {
				if (num[i]==num[j]) {
					System.out.println("Duplicate values:"+num[i]);
			

				}
			}
			
			
		}
		
	}

}
