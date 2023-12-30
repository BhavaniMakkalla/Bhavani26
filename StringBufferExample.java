package Training;

public class StringBufferExample {

	public static void main(String[] args) {
		  StringBuffer stringBuffer1 = new StringBuffer("Hello, ");

	        stringBuffer1.append("World!");
	        System.out.println("Appended String: " + stringBuffer1);

	        StringBuffer stringBuffer2 = new StringBuffer();
	        stringBuffer2.append("Java ").append("StringBuffer ").append("Example");
	        System.out.println("Concatenated String: " + stringBuffer2);

	        StringBuffer stringBuffer3 = new StringBuffer("This is a StringBuffer example.");
	       
	        stringBuffer3.insert(5, "UPDATED ");
	        
	        stringBuffer3.delete(10, 19);
	        System.out.println("Modified String: " + stringBuffer3);

	        
	        StringBuffer stringBuffer4 = new StringBuffer("Reverse this");
	        stringBuffer4.reverse();
	        System.out.println("Reversed String: " + stringBuffer4);
	     
	        StringBuffer stringBuffer5 = new StringBuffer("Capacity");
	        System.out.println("Initial Capacity: " + stringBuffer5.capacity());
	        System.out.println("Initial Length: " + stringBuffer5.length());

	        stringBuffer5.setLength(5);
	        System.out.println("After Setting Length: " + stringBuffer5);

	        stringBuffer5.setLength(0);
	        System.out.println("After Clearing: " + stringBuffer5);

	}

}
