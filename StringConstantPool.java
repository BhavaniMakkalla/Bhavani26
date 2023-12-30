package Training;

public class StringConstantPool {

	public static void main(String[] args) {
		String str1 = "Hello, World!";
        String str2 = "Hello, World!";
        System.out.println("Example 1: str1 == str2? " + (str1 == str2));
        String str3 = new String("Hello, World!");
        System.out.println("Example 2: str1 == str3? " + (str1 == str3));
        String str4 = new String("Hello, World!").intern();
        System.out.println("Example 3: str1 == str4? " + (str1 == str4));
	}

}
