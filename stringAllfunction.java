package strings;

public class stringAllfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("Hello World!");
	//	str.append("Learn Java ");
		System.out.println(str);
	//	System.out.println(str.length());
	//	str.insert(12,"Wow ");
	//	System.out.println(str);
	//	System.out.println(str.charAt(15));
		StringBuffer str2 =new StringBuffer("Hello World!");
		System.out.println(str2);
		System.out.println(str.compareTo(str2));
		System.out.println(str2.replace(0, 5,"Welcome to "));
		System.out.println(str2.reverse());
		str.setCharAt(1, 'T');
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 12));
		String sb = str.toString(); // Stringbuffer to String convert
		System.out.println(sb);
		String sb1 = "HTllo World!";
		System.out.println(sb.contentEquals(sb1));
		str.trimToSize();
		System.out.println(str);
		//str.capacity();
		System.out.println(str.capacity());
		System.out.println(str==str2);
		System.out.println(str+" "+str2.reverse());
		System.out.println(str.equals(str2));
		String name1 = new String("Myschool");
		String name2 =new String("Myschool");
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));

	}

}
