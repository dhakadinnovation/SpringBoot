package com.dhakad.topic.service;

import com.dhakad.topic.model.Topic;
import com.dhakad.topic.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopicList(){
        //return  bookList;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(n-> topics.add((Topic)n));
        return topics;
    }

    public Optional<Topic> getTopic(Long id)
    {
        //return  TopicList.stream().filter(t->t.getId().equals(id)).findFirst().get();

        return topicRepository.findById(id);
    }
    public void addTopic(Topic topic)
    {
       // TopicList.add(Topic);
        topicRepository.save(topic);
    }
    public void updateTopic(Long id, Topic topic)
    {
       /* for (int i =0; i<TopicList.size(); i++){
            Topic TopicItem = TopicList.get(i);
            if (TopicItem.getId().equals(id))
            {
                TopicList.set(i,Topic);
                return;
            }

        }*/
        topicRepository.save(topic);
    }
    public void deleteTopic(Long id)
    {
       // bookList.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
