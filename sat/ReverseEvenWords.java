package week3.day1.sat;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text =" I am a software tester";
		String[] product = text.split(" ");
		for (int i=0;i<product.length;i++) {
		if (i % 2 != 0) {
			char[] charArray = product[i].toCharArray();
		for (int j=charArray.length-1;j>=0;j--) {
			System.out.println(charArray[j]);
		}
		System.out.println(" ");
		}else {
			System.out.println(product[i]+" ");
			
		}
		}
		}
	}

