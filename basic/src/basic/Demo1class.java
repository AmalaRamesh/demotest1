package basic;

public class Demo1class {

	public static void main(String[] args) {
//		int a=10;
//		a++;
//		System.out.println(a++);
//		System.out.println(a);
//		++a;
//		System.out.println(++a);
		
		int a=3,b=4,c;
		System.out.println( a + b + a++ + b++ + a++ + ++b + a++);
		                    3 + 4 + 3   + 4    + 4 +  6 + 5
//		System.out.println(a++ + ++a - --a + ++a); 
		
		//                 10  +  12 - 11 + 12       
	}

}
