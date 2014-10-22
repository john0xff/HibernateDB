package com.single.table.student;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student", catalog = "tutorials")
public class Student implements java.io.Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "STUDENT_ID", unique = true, nullable = false)
	private Integer studentId;

	@Column(name = "STUDENT_NAME", nullable = false, length = 10)
	private String studentName;

	@Column(name = "STUDENT_AGE", nullable = false, length = 20)
	private String studentAge;

	public Student()
	{
	}

	public Student(String studentName, String studentAge)
	{
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public Integer getStudentId()
	{
		return this.studentId;
	}

	public void setStudentId(Integer studentId)
	{
		this.studentId = studentId;
	}

	public String getStudentName()
	{
		return this.studentName;
	}

	public void setStudentName(String studentName)
	{
		this.studentName = studentName;
	}

	public String getStudentAge()
	{
		return this.studentAge;
	}

	public void setStudentAge(String studentAge)
	{
		this.studentAge = studentAge;
	}
}