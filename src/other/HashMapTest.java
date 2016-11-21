package other;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, User> temp = new HashMap<>();
		
		User u1 =  new HashMapTest().new User("first", "Name");
		temp.put("aaa", u1);
		u1.title = "second";
		//pass by ref
		User u2 = temp.get("aaa");
		System.out.println(u2.title);
	
		u2.title = "third";
		u1.title = "fourth";
		User u3 = temp.get("aaa");
		System.out.println(u3.title);
		
	}
	 class User{
		String title;
		String Name;
		public User(String t,String n) {
			this.title = t;
			this.Name = n;
		}
	}

}
