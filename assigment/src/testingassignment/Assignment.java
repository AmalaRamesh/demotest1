package testingassignment;

public class Assignment {

	public static void main(String[] args) {
		int a=9;
		int b=2;
		b+=a; //9+2=11
		b*=a; // 11*9 =99
		System.out.println(b);
		System.out.println(5<9);
		System.out.println(9 >= 8);//true or false
		int mark=60;
		if(mark >90) //60>90  false
			{
			System.out.println("pass");
			
	}
		else {System.out.println("fail");

}
	System.out.println((6>2)&&(7>2)); // both side are true it condition is true
	System.out.println((1 >2)||(7>2));
	System.out.println(!(7>2));
	int mark1 =40;
	int mark2 =60;
	if(mark1>50 || mark2>40) {
		System.out.println("pass");
		
	}else {System.out.println("fail");
	}
	int x=5;
	int y=++x; //1+5 =6
	int y1 =y++; //5+1=6
	System.out.println(y); //y= 1+5=6, 6++ (6+1=7)
	int x1=4; //100
	int z=6;  //110
	System.out.println(x1 & z);
	System.out.println(x1 | z);
	int r =~4;
	System.out.println(r);
	
			
	}}
