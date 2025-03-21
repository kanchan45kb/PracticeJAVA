package arrayspractice;

public class array06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "I have elephant with umbrela and orange ";
		char c[]= word.toCharArray(); 
		int l = word.length();
		System.out.println(word.length());
		int i;
	for(char ch:c)
		{
			if(ch=='a'||ch=='i'||ch=='I'||ch=='e'||ch=='o'||ch=='u') {
				System.out.println("vowel= "+ch);
			}
			else if(ch!='a'||ch!='i'||ch!='I'||ch!='e'||ch!='o'||ch!='u') {
				System.out.println("Consent= "+ch);
			}
		}

	}

}
