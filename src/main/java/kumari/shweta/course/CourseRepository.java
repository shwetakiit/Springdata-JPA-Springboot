/**
 * 
 */
package kumari.shweta.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kumari.shweta.Topic.Topic;

/**
 * @author Shweta kumari
 *
 */

public interface CourseRepository extends  CrudRepository<Course,String>{

	public  List<Course> findByName(String name);
	//public List<Course>  findByDescription(String description);
	//public List<Course> findByTopic(String topicId);
	//*/

	List<Course> findByTopicId(String topicId);
}
