package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent{
	public static void main(String[] args) {
		Student s1 = new Student(10, 120, 30);
		Student s2 = new Student(4, 210, 100);
		Student s3 = new Student(40, 201, 20);
		Student s4 = new Student(150, 20, 30);
		List<Student> list = new ArrayList<>();
		list.add(s4);
		list.add(s3);
		list.add(s2);
		list.add(s1);
		System.out.println("sort on mark 1");
		Collections.sort(list, new StudentComparatorMark1());
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("sort on mark 2");

		Collections.sort(list, new StudentComparatorMark2());
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("sort on mark 3");

		Collections.sort(list, new StudentComparatorMark3());
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("default");

		Collections.sort(list);
		for (Student student : list) {
			System.out.println(student);
		}

	}
}