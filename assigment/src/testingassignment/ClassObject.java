package testingassignment;

public class ClassObject {
	int x=4; 
	static String name = "devi";// its declared to class instance variable 

	public static void main(String[] args) {
		int a=6; //its declared to the method is called local variable
		ClassObject obj =new ClassObject();
		System.out.println(obj.x);
		System.out.println(ClassObject .name );
		
	}

}
