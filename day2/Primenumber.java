package week1.day2;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number=13;
      boolean count=false;
      for (int i=2;i<=number/2;i++) {
        if (number%i !=0) {
    		  count=true;
    		  break;
    	  }
      }
    	  
	if (count) {
		System.out.println("It is a prime number");
	}else
		System.out.println("It is not a prime number");
	}

}
