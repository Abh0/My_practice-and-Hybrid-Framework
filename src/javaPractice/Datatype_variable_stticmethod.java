package javaPractice;

public class Datatype_variable_stticmethod {
	int b =20;
	static  int empid = 101;
	public void m1() {
		int a= 10;
		System.out.println("M1 executed");
		System.out.println("Local variable "+a);
	}
	public void m2() {
		System.out.println("M2 executed");
		System.out.println("instance variable"+b);
		System.out.println("static variable"+empid);
		
	}
		public void m3() {
			System.out.println("M3 executed");
			System.out.println("instance variable"+b);
			System.out.println("static variable"+empid);
			
		}
		public static void st() {
			System.out.println("static method executed");
			
			
		}
			public static void main(String[] args) {
				System.out.println("Main method executed");
				
				Datatype_variable_stticmethod m =new  Datatype_variable_stticmethod();
				m.m1();
				m.m2();
				m.m3();
				Datatype_variable_stticmethod.st();
	
	

}
}