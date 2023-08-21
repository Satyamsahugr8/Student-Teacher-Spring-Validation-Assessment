package com.test.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Teacher {
	
	@Size(min = 1, message = "first name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String firstName;
	
	@Size(min = 1, message = "last name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String lastName;
	
	@Size(min = 1, message = "employeeId is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String empId;
	
	@Size(min = 1, message = "Subject name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String subject;

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

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Teacher(String firstName,String lastName,String empId, String subject)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.subject = subject;
	}

	public Teacher() {
		super();
		
	} 
	
	
	
	

}
