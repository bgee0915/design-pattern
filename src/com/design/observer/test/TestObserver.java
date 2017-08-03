package com.design.observer.test;

import java.util.Vector;

import com.design.observer.bean.Observer;
import com.design.observer.bean.Student;
import com.design.observer.bean.Teacher;

public class TestObserver {
	public static void main(String[] args){
		
		
		Teacher teacher = new Teacher();
		Vector<Observer> vector = new Vector<Observer>();
		
		for(int i=0; i<10; i++){
			Student student = new Student();
			student.setName("student_" + i);
			student.setTeacher(teacher);
			vector.add(student);
			
			student.toString();
		}
		teacher.setStudents(vector);

		
		teacher.setPhone("10987654321");
		for(int i=0; i<10; i++){
			Student s = (Student)vector.get(i);
			System.out.println(s.toString());
		}
		teacher.setPhone("88888888888");
		
		for(int i=0; i<10; i++){
			Student s = (Student)vector.get(i);
			System.out.println(s.toString());
		}
		
		
	}
}
