package mahesh;

public class Demo {
	//instace variables
	int x=5;
	int y=10;
	String a="mahesh";

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d.x);
		System.out.println(new Demo().x);
		System.out.println(d.a);
		System.out.println(new Demo().a);
		

	}

}
