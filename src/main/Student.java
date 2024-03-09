package main;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String codeSV;
	private String name;
	private int year;
	private float scoreAvg;
	

	public Student(String codeSV) {
		this.codeSV = codeSV;
	}
	

	public Student(String codeSV, String name, int year, float scoreAvg) {
		this.codeSV = codeSV;
		this.name = name;
		this.year = year;
		this.scoreAvg = scoreAvg;
	}
	
	public String getCodeSV() {
		return codeSV;
	}
	public void setCodeSV(String codeSV) {
		this.codeSV = codeSV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(codeSV, other.codeSV);
	}


	public void setYear(int year) {
		this.year = year;
	}
	public float getScoreAvg() {
		return scoreAvg;
	}
	public void setScoreAvg(float scoreAvg) {
		this.scoreAvg = scoreAvg;
	}

	@Override
	public String toString() {
		return "Student: codeSV=" + codeSV + ", name=" + name + ", year=" + year + ", scoreAvg=" + scoreAvg;
	}

	@Override
	public int compareTo(Student o) {
		return this.codeSV.compareTo(o.codeSV);
	}

}
