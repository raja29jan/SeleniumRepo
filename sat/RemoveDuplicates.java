package week3.day1.sat;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
        String[] product = text.split(" ");
        for (int i = 0; i < product.length; i++) {
            int count = 0;
            for (int j = 0; j < product.length; j++) {
                if (product[i].equals(product[j])) {
                    count++;
                }
            }
            if (count > 1) {
                product[i] = ""; 
            }
        }
        String text1 = String.join(" ", product);
        System.out.println("Text: " + text1.trim()); 
	}
}

