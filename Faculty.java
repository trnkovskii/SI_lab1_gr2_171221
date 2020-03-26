import java.util.ArrayList;

public class Faculty {
	private String facultyName;
	private int noOfStudents;
	private String teacher;
	public static int instances = 0;
	private ArrayList<Student> studentList;

	public String getfacultyName() {
		return this.facultyName;
	}

	public int getNoOfStudents() {
		return this.noOfStudents;
	}

	public String getTeacher() {
		return this.teacher;
	}

	public void setfacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public Faculty() {
		instances++;
		this.noOfStudents = 0;
		this.facultyName = "Not Set";
		this.teacher = "Not Set";
	}

	public Faculty(int noOfStudents, String facultyName, String teacher) {
		this.studentList = new ArrayList<Student>();
		this.facultyName = facultyName;
		this.teacher = teacher;
	}

	public boolean addStudent(Student student) {
		if (student == null || studentList.contains(student)) {
			return false;
		}
		studentList.add(student);
		return true;
	}

	public void printStudents() {
		for (Student s : studentList)
			System.out.println(s.getName() + ", with " + s.getAge() + " year(s)");
	}

	public static class Student {
		private int number;
		private String name;
		private int age;
		// Basically anything that makes sense for a student.

		public Student(int number, String name, int age) {
			this.number = number;
			this.name = name;
			this.age = age;
		}

		public int getNumber() {
			return this.number;
		}

		public String getName() {
			return this.name;
		}

		public int getAge() {
			return this.age;
		}
	}

	public static void main(String[] args) {
		Faculty oop = new Faculty(6, "Object Oriented Programming", "LeBron James");
		oop.addStudent(new Faculty.Student(6, "Michael Jordan", 56));
		oop.addStudent(new Faculty.Student(23, "Kyrie Irving", 24));
		oop.addStudent(new Faculty.Student(14, "Kevin Love", 27));
		System.out.println(oop.getfacultyName() + " has the following students");
		oop.printStudents();

	}

}
