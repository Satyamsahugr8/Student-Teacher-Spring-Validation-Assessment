package com.test.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.model.Student;
import com.test.model.Teacher;

@Controller
public class MyController {

	@RequestMapping("/")
	public String showMessage() {
		return "index";
	}

	@RequestMapping("/teacherForm")
	public String teacherForm(Model model) {
		Teacher obj = new Teacher();
		model.addAttribute("teacher", obj);
		return "Teacher-Input-Page";
	}

	@RequestMapping("/studentForm")
	public String studentForm(Model model) {
		Student obj = new Student();
		model.addAttribute("student", obj);
		return "Student-Input-Page";
	}

	@RequestMapping("/submitFormTeacher")
	public String SubmitFormTeacher(@Valid @ModelAttribute("teacher") Teacher obj, BindingResult result) 
	{
		if (result.hasErrors())
			return "Teacher-Input-Page";
		return "Confirmation-Teacher-Page";
	}

	@RequestMapping("/submitFormStudent")
	public String SubmitFormStudent(@Valid @ModelAttribute("student") Student obj, BindingResult result) 
	{
		if (result.hasErrors())
			return "Student-Input-Page";
		return "Confirmation-Student-Page";
	}
//	@RequestMapping("/hey")
//	public String showText() {
//		return "hey";
//	}
}
