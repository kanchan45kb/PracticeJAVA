package practice.practice1;

public class datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = -128;
		byte b = 127;
		System.out.println("Byte range" + a + " to " + b); // "+" concatination always need to use
		char x = 'A'; // char always in single quotes
		String name = "Name"; // string always in double quotes
		System.out.println(x + " " + name);
		String[] boys = { "John", "james", "smith", "black", "white" }; // Array define and print all values
		for (int i = 0; i < boys.length; i++) {
			System.out.println(boys[i]);
		}
	}

}
