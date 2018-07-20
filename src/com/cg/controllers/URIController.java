package com.cg.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.CourseList;
import com.cg.services.SchedulerService;


@Controller
public class URIController {

	@Autowired(required=true)
	SchedulerService service;
	@RequestMapping("/")
	public ModelAndView getIndexPage() {
		
		List<CourseList>clist=service.getdetails();
		ModelAndView modelAndView = new ModelAndView("schedulersessions", "courses", clist);
		return modelAndView;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
public ModelAndView getUpdate(@ModelAttribute("course") CourseList course) {
			course =service.updatedetails(course);
			ModelAndView modelAndView = new ModelAndView("updatesession", "course", course);
			return modelAndView;
		
	}
	@ModelAttribute("course")
	public CourseList getCourse() {
	return new CourseList();
}
}
