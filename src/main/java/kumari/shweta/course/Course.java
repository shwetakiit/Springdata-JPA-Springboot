package kumari.shweta.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import kumari.shweta.Topic.Topic;
import kumari.shweta.Topic.TopicService;
/**
 * @author Shweta kumari
 *
 */
@Entity
public class Course {
	


	
    @Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne()
	Topic topic;
	
	public Course() {

	}	
	public Course(String id, String name, String description,String topicId) {
		
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic= new Topic(topicId,"","");
	}

	
	 public Topic getTopic() { return topic; }
	 
	
	 public void setTopic(Topic topic) { this.topic = topic; }
	 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}	
}
