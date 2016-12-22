package other;

public class A{
	private void printName(){
		System.out.println("A");
	}
	public static void main(String[] args) {
		A a = new Test();
		a.printName();
	}
}
 class Test extends A{
	public void printName(){
		System.out.println("B");
	}
}
