package collection;

import java.util.Comparator;

class Student implements Comparable<Student> {
	Integer marks1;
	Integer marks2;
	Integer marks3;

	public Student(int a, int b, int c){
		marks1 = a;
		marks2 = b;
		marks3 = c;
	}

	@Override
	public int compareTo(Student o) {
		return this.marks1.compareTo(o.marks1);
	}
	@Override
	public String toString() {
		return this.marks1+"  "+this.marks2+"    "+this.marks3;
	}
}
class StudentComparatorMark1 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks1.compareTo(o2.marks1);
	}
}
class StudentComparatorMark2 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks2.compareTo(o2.marks2);
	}
}
class StudentComparatorMark3 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.marks3.compareTo(o2.marks3);
	}
}
