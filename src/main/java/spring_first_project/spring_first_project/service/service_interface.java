package spring_first_project.spring_first_project.service;

import java.util.List;

import spring_first_project.spring_first_project.entities.course;

public interface service_interface 
{
	
	public List<course> getCourses();
	public course getCourse(long courseId);
	public course addCourse(course course);
	
}
