package kumari.shweta.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Shweta kumari
 *
 */
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
	
	
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("java", "Advance java", "Java/J2EE"),
	new Topic("Spring", "Spring AOP", "Spring AOP for interceptor")));

	public List<Topic> getAllTopic() {
		List<Topic> topics= new ArrayList<>();
       topicRepository.findAll().forEach(topics::add);
		  return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(topic->topic.getId().equals(id)).findFirst().get();
	//	Optional<Topic>  topic=	topicRepository.findById(id);
	//  return topic.get();
	}
	
	public void addTopic(Topic topic) {
	topicRepository.save(topic);
	}
	
	public void updateTopic(String id,Topic topic) {
     topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}

}
