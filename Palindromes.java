package allStringMethods;

public class Palindromes {

	public static void main(String[] args) {
		String name ="madam"; // Is the word 'madam' a Palindromes ?
		
		StringBuilder sb =new StringBuilder(name);
		String newName =sb.reverse().toString();
		
		System.out.println("It is Palindromes ! : "+name.equals(newName));
	
System.out.println("--------------------------------------------------------------");

}
}
