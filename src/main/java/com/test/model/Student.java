package com.test.model;

//import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	@Size(min = 1, message = "first name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String firstName;

	@Size(min = 1, message = "last name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,10}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String lastName;

	@Size(min = 1, message = "roll name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{3,15}", message = "should have atleast 3 characters")
	private String rollNo;

	@Size(min = 1, message = "Branch name is a required field")
	@Pattern(regexp = "[a-zA-Z0-9]{2,15}", message = "should have atleast 3 characters")
//	@Min(value=4)
	private String branch;

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

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Student(String firstName,String lastName,String rollNo,String branch )
	{   super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.branch = branch;
	}

	public Student() {
		super();

	}

}
