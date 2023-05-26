package week1.day2;

public class Fibonacci {

public static void main(String[] args) {
				// TODO Auto-generated method stub
				int range=10;
				int sum, firstnumber=0,secondnumber=1;
				System.out.println(firstnumber);
				for (int i=0;i<range;i++) {
					sum=firstnumber+secondnumber;
					firstnumber=secondnumber;
					secondnumber=sum;
					System.out.println(sum);
				}
			}


}
