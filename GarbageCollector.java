package Training;

public class GarbageCollector {

	public static void main(String[] args) {
		 MyClass obj1 = new MyClass("Object 1");
	        MyClass obj2 = new MyClass("Object 2");
	        MyClass obj3 = new MyClass("Object 3");

	        obj1.reference = obj2;
	        obj2.reference = obj3;
	        obj3.reference = obj1;

	        obj1 = null;
	        obj2 = null;
	        obj3 = null;

	        System.gc();

	    }
	}

	class MyClass {
	    String name;
	    MyClass reference;

	    public MyClass(String name) {
	        this.name = name;
	        System.out.println(name + " created.");
	    }

	    protected void finalize() throws Throwable {
	        System.out.println(name + " destroyed.");

	}

}
