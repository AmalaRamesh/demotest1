package testingassignment;

public class Shop { //classname =shop
	String name="devi";
	int number=9087765;
	void price() {  //return type 
		System.out.println("product price");
	}
	
	

public String toString1() {
	return "Shop [name=" + name + ", number=" + number + "]";
}



	public static void main(String[] args) {
		Shop ob =new Shop();
		System.out.println(ob.name);
		ob.number=6785;
		System.out.println(ob.number);
		ob.price();
	}

	}
