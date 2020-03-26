class Student {

	String index;
	String firstName;
	String lastName;
	int[] grades = null;

	public Student(String index, String firstName, String lastName, int[] grades) {
		super();
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage(int[] grades) {
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += i;
		}
		return sum / grades.length;
	}

	public int ECTSCredits(int[] grades) {
		int counter = 0;
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > 5) {
				counter++;
			}
		}
		return counter * 6;
	}
}


