// Check whether the given number is even or odd and  greater than 10 or not
//
class Greater10{
	public static void main(String[] args){

		int num = 5;

		if(num%2==0 && num < 10){
			System.out.println("Number is even and less than 10");
		} else if(num == 10){
			System.out.println("Number is even and 10");
		} else if (num%2==0 && num>10){
			System.out.println("Number is even and greater than 10");
		} else if(num%2==1 && num<10){
			System.out.println("Number is odd and less than 10");
		} else {
			System.out.println("Number is odd and greater than 10");
		}
	}
}

