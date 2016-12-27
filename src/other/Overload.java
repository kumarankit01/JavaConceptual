package other;

public class Overload {

	void print(Object o){
		System.out.println("object");
	}
	void print(String o){
		System.out.println("String");
	}
	void print(Integer o){
		System.out.println("Integer");
	}
	void print(float o){
		System.out.println("float");
	}
	void print(double o){
		System.out.println("double");
	}
	void print(short o){
		System.out.println("short");
	}
	
	public static void main(String[] args) {
		new Overload();
	}
}
