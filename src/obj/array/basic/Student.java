package obj.array.basic;

import java.util.ArrayList;

public class Student {
	private static int id = 1000;
	private int studentId;
	private String name;
	private int totalScore;
	private ArrayList<Subject> subjectList;
	
	public Student(String name) {
		super();
		Student.id++;
		this.studentId = Student.id;
		this.name = name;
		this.totalScore = 0;
		this.subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String subjectName, int score) {
		subjectList.add(new Subject(subjectName, score));
		totalScore += score;
	}
	
	public void showStudentInfo() {
		StringBuilder sb = new StringBuilder();
		String newLine = System.lineSeparator();
		String colon = ": ";
		String space = " ";
		sb.append(id);
		sb.append(space);
		sb.append(name);
		sb.append(newLine);
		for(Subject subject : subjectList) {
			sb.append(subject.getName());
			sb.append(colon);
			sb.append(subject.getScore());
			sb.append(newLine);
		}
		sb.append(totalScore);
		System.out.println(sb.toString());
	}
	
}
