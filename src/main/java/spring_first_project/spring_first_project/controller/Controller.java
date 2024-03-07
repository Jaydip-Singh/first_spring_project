package spring_first_project.spring_first_project.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring_first_project.spring_first_project.entities.course;
import spring_first_project.spring_first_project.service.service_class;
import spring_first_project.spring_first_project.service.service_interface;

@RestController
@RequestMapping("/api")
public class Controller 
{
//	@GetMapping("/name")
//	public String name()
//	{
//		return "my name is JaydipSingh Thakur";
//	}
	//get course details
	@Autowired
	private service_interface service_Interface;
	
	service_class obj=new service_class();
	@GetMapping("/courses")
	public List<course> getCourses()
	{
		
		return this.service_Interface.getCourses();
	}
	
	@GetMapping("course/{courseId}")
	public course getCourse(@PathVariable String courseId)
	{
		return this.service_Interface.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping("/addcourse")
	public course addCourse(@RequestBody course course)
	{
		return this.service_Interface.addCourse(course);
	}
	
}
