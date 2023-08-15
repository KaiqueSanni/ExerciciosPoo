package entities;

public class Student {

	public String name;
	public double grande1;
	public double grande2;
	public double grande3;

	public double finalGrade() {
		return grande1 + grande2 + grande3;
	}

	public double missingPoints() {
		if (finalGrade() < 60.0) {
			return 60.0 - finalGrade();
		} else {
			return 0.0;
		}

	}
}