package kumari.shweta.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Shweta kumari
 *
 */
@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
    
	public List<Course> getAllCourses(String topicId) {
		
		List<Course> courses= new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
		
	}
	
	public Course getCourse(String id) {
	 Optional<Course> option= courseRepository.findById(id);
     return option.get();
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	public void updateCourse(Course course) {
		courseRepository.save(course);
	}
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
}

