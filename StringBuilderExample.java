package Training;

public class StringBuilderExample {

	public static void main(String[] args) {
		 StringBuilder stringBuilder1 = new StringBuilder("Hello, ");

	        stringBuilder1.append("World!");

	        String result1 = stringBuilder1.toString();

	        System.out.println("Example 1: " + result1);

	        StringBuilder stringBuilder2 = new StringBuilder();

	        stringBuilder2.append("Java ").append("StringBuilder ").append("Example");

	        String result2 = stringBuilder2.toString();

	        System.out.println("Example 2: " + result2);

	        StringBuilder stringBuilder3 = new StringBuilder("This is a StringBuilder example.");

	        stringBuilder3.insert(5, "UPDATED ");

	        stringBuilder3.delete(10, 19);

	        String result3 = stringBuilder3.toString();

	        System.out.println("Example 3: " + result3);

	}

}
