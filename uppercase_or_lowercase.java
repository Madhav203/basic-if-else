// Uppercase or not
//
class Uppercase{
	public static void main(String[] args){

		char ch = 'a';

		if (ch >= 'a' && ch <= 'z'){
			System.out.println("Character is lowercase");
		} else if (ch >= 'A' && ch <= 'Z'){
			System.out.println("Character is Uppercase");
		} else {
			System.out.println("Enter valid character");
		}

	}
}