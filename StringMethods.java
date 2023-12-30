package Training;

public class StringMethods {

	public static void main(String[] args) {
		String myString = "Hello, World!";

        char charAtIndex = myString.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        int length = myString.length();
        System.out.println("Length of the string: " + length);

        String newString = myString.concat(" How are you?");
        System.out.println("Concatenated String: " + newString);

        String substring = myString.substring(0, 5);
        System.out.println("Substring (0 to 4): " + substring);

        int indexOfWorld = myString.indexOf("World");
        System.out.println("Index of 'World': " + indexOfWorld);
        int countOfO = myString.length() - myString.replace("o", "").length();
        System.out.println("Count of 'o' in the string: " + countOfO);

        System.out.println("Uppercase: " + myString.toUpperCase());
        System.out.println("Lowercase: " + myString.toLowerCase());

        String replacedString = myString.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedString);

        String whitespaceString = "   This is a string with whitespace.   ";
        System.out.println("Trimmed String: " + whitespaceString.trim());

        boolean startsWithHello = myString.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        boolean endsWithWorld = myString.endsWith("World!");
        System.out.println("Ends with 'World!': " + endsWithWorld);

        boolean containsHello = myString.contains("Hello");
        System.out.println("'Hello' in the string: " + containsHello);

	}

}
