package javaPractice;

public class Create_Class_Method_Object {
	public void m1() {
		System.out.println("m1 method executed");
	}
	public void m2() {
		System.out.println("m2 method executed");
		
	}
	public void m3() {
		System.out.println("m3 method executed");
		
	}

	public static void main(String[] args) {
		System.out.println("welcome to selenium training");
		Create_Class_Method_Object m = new Create_Class_Method_Object() ;
		m.m1();
		m.m2();
		m.m3();
	}

}
