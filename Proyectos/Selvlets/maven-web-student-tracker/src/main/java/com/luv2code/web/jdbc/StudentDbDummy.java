package com.luv2code.web.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

public class StudentDbDummy {

	private DataSource dataSource;
	static List<Student> students=new ArrayList<>();
	static int idContador=0;
			
	StudentDbDummy(){
				students.add(new Student(++idContador,"Patrobas","PatrobasA","patro@gmail.com"));
				students.add(new Student(++idContador,"Patrobas2","Patrobas2A","patro2@gmail.com"));
				students.add(new Student(++idContador,"Patrobas3","Patrobas3A","patro3@gmail.com"));
			}

	
	public List<Student> getStudents() throws Exception {
	
			
			return students;			
	}


	public void addStudent(Student theStudent) throws Exception {
		theStudent.setId(++idContador);;
		students.add(theStudent);
	}

	public Student getStudent(String theStudentId) throws Exception {
		Student student=null;
		for(Student e:students) {
			if(e.getId()==Integer.valueOf(theStudentId)) {
				student=e;
				return e;
			}
			
		}
			
			return null;
	}

	public void updateStudent(Student theStudent) throws Exception {
		//theStudent.setFirstName(theStudent.getFirstName());
		
		for(Student e:students) {
			if(e.getId()==Integer.valueOf(theStudent.getId())) {
				e.setFirstName(theStudent.getFirstName());
				e.setLastName(theStudent.getLastName());
				e.setEmail(theStudent.getEmail());
			}
		}
	
	}

	public void deleteStudent(String theStudentId) throws Exception {
		Student student=null;
		for(Student e:students) {
			if(e.getId()==Integer.valueOf(theStudentId)) {
				student=e;
				students.remove(e);
				break;
			}
		}
		//students.remove(student);
	}
}















