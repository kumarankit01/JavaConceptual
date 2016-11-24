package collection;

import java.util.HashMap;

public class HashMapTest {

	private static final String KEY = "aaa";
	public static void main(String[] args) {
		HashMap<String, User> temp = new HashMap<>();
		User u1 =  new HashMapTest().new User("first", "Name");
		temp.put(KEY, u1);
		u1.title = "second";
		//pass by value which is reference
		User u2 = temp.get(KEY);
		System.out.println(u2.title); //changed to second
	
		// u1 is still pointing to object as well as u2.
		u2.title = "third";
		u1.title = "fourth";
		User u3 = temp.get(KEY);
		System.out.println(u3.title);//fourth
		changeUser(u3);
		
		User u4 = temp.get(KEY);
		System.out.println(u4.title);// fifth
		
		User u5 = temp.get(KEY);
		u5 = new HashMapTest().new User("title5", "name5"); // now it starts pointing to new object, old object stay intact.
		User u6 = temp.get(KEY);
		System.out.println(u6.title); // fifth
		System.out.println(u6.Name); // Name

		
	}
	 private static void changeUser(User u3) {
		u3.title = "fifth";
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
