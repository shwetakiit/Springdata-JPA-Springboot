package kumari.shweta.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kumari.shweta.Topic.Topic;
import kumari.shweta.Topic.TopicService;

/**
 * @author Shweta kumari
 *
 */
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId) {
		Topic topic=topicService.getTopic(topicId);
		course.setTopic(topic);
		courseService.addCourse(course);
	}
	
   @RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable  String id) {
	//   course.setTopic(new Topic(topicId,"",""));
	   courseService.updateCourse(course);
	}
	
   @RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
   public void deleteCourse(@PathVariable String id) {
	   courseService.deleteCourse(id);
   }

}
