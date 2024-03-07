package spring_first_project.spring_first_project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import spring_first_project.spring_first_project.entities.course;
@Service
public class service_class implements service_interface
{
	
	List<course> list=new ArrayList<course>();
	public service_class()
	{
		list.add(new course(10,"springBoot","spring boot is necessory course for backend"));
		list.add(new course(11,"flutter","flutter is used for frontend application"));
		list.add(new course(12,"microservices","we can create better backend with help of microservices"));
		
	}
	public List<course>getCourses()
	{
			return list;
	}
	public course getCourse(long courseId)
	{
		for(course course:list)
		{
			if(course.getId()==courseId)
			{
				return course;
			}
		}
		return null;
	}

	public course addCourse(course course)
	{
		list.add(course);
		return course;
	}
}
