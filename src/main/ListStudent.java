package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListStudent {
	private ArrayList<Student> list;

	public ListStudent() {
		this.list = new ArrayList<Student>();
	}
	public ListStudent(ArrayList<Student> list) {
		this.list = list;
	}
	
	public void addStudent(Student sv) {
		this.list.add(sv);
		
	}
	
	public void printList() {
		for (Student student : list) {
			System.out.println(student.toString());
		}
	}
	
	public boolean checkListNull() {
		return this.list.isEmpty();
		
	}
	
	public int getNumberOfStudent() {
		return this.list.size();
	}
	
	public void makingNullList() {
		 this.list.removeAll(list);
	}
	
	// sinh vien co ton tai hay khong
	public boolean checkingExist(Student sv) {
		return this.list.contains(sv);
	}
	
	public boolean deleteStudent(Student sv) {
		return this.list.remove(sv);
	}
	
	public void findStudent(String name) {
		for (Student student : list) {
			if(student.getName().indexOf(name) >= 0) {
				System.out.println(student);
			}
		}
	}
	
	public void sortScoreDesc() {
		Collections.sort(this.list, new Comparator<Student>(){
			public int compare(Student sv1, Student sv2) {
				if(sv1.getScoreAvg() < sv2.getScoreAvg()) {
					return 1;
				}else if(sv1.getScoreAvg() > sv2.getScoreAvg()) {
						return -1;
				}else {
					return 0;
				}
				
			}
		});
	}
}
