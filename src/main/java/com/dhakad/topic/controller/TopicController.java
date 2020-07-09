package com.dhakad.topic.controller;

import com.dhakad.topic.model.Topic;
import com.dhakad.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    //this is to get all book list
    @RequestMapping("/topics")
    public List<Topic> getTopics(){
        return topicService.getTopicList();
    }

    //this is to get Topic object by id
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable Long id)
    {
        return topicService.getTopic(id);
    }

    //this is to add Topic
    @RequestMapping(method = RequestMethod.POST, value = "/topics/")
    public void addTopic(@RequestBody Topic topic)
    {
         topicService.addTopic(topic);
    }

    //this is to add Topic
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@PathVariable Long id,@RequestBody Topic topic)
    {
        topicService.updateTopic(id, topic);
    }

    //this is to add Topic
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable Long id)
    {
        topicService.deleteTopic(id);
    }

}
