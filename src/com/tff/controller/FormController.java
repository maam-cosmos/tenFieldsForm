package com.tff.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tff.entity.InputFieldValueGenerator;
import com.tff.entity.Student;
import com.tff.entity.StudentsList;

@Controller
public class FormController {
	
	@Autowired
	StudentsList studentsList;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
    public String registrationForm(Model model) {
		model.addAttribute("student", new Student());
        model.addAttribute("hobbiesList", new InputFieldValueGenerator().getHobbies());
        model.addAttribute("districtList", new InputFieldValueGenerator().getDistricts());
        model.addAttribute("languageList", new InputFieldValueGenerator().getLanguages());
        model.addAttribute("studentsList", studentsList.showData());
        System.out.println("hello from GET");
        return "index";
    }

	@RequestMapping(value="/result", method=RequestMethod.POST)
    public String registrationFormSubmit(@Valid @ModelAttribute("student") Student student, BindingResult result, Model model) {
    	System.out.println("hello from POST");
    	
    	studentsList.addData(student);

        System.out.println("POST METHOD: "+student.getFirstName());
        return "redirect:/";
    }

}
